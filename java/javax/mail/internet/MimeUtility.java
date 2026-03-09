package javax.mail.internet;

import com.github.kevinsawicki.http.HttpRequest;
import com.lidroid.xutils.http.client.multipart.MIME;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.BEncoderStream;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.QDecoderStream;
import com.sun.mail.util.QEncoderStream;
import com.sun.mail.util.QPDecoderStream;
import com.sun.mail.util.QPEncoderStream;
import com.sun.mail.util.UUDecoderStream;
import com.sun.mail.util.UUEncoderStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import javax.activation.DataHandler;
import javax.mail.MessagingException;
import org.apache.commons.p284io.IOUtils;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes2.dex */
public class MimeUtility {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ALL = -1;
    public static final int ALL_ASCII = 1;
    public static final int MOSTLY_ASCII = 2;
    public static final int MOSTLY_NONASCII = 3;
    private static String defaultJavaCharset;
    private static String defaultMIMECharset;
    private static final Map<String, Boolean> nonAsciiCharsetMap = new HashMap();
    private static final boolean decodeStrict = PropUtil.getBooleanSystemProperty("mail.mime.decodetext.strict", true);
    private static final boolean encodeEolStrict = PropUtil.getBooleanSystemProperty("mail.mime.encodeeol.strict", false);
    private static final boolean ignoreUnknownEncoding = PropUtil.getBooleanSystemProperty("mail.mime.ignoreunknownencoding", false);
    private static final boolean allowUtf8 = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", false);
    private static final boolean foldEncodedWords = PropUtil.getBooleanSystemProperty("mail.mime.foldencodedwords", false);
    private static final boolean foldText = PropUtil.getBooleanSystemProperty("mail.mime.foldtext", true);
    private static Map<String, String> java2mime = new HashMap(40);
    private static Map<String, String> mime2java = new HashMap(14);

    /* JADX INFO: renamed from: javax.mail.internet.MimeUtility$1NullInputStream */
    public class C1NullInputStream extends InputStream {
        @Override // java.io.InputStream
        public int read() {
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.sun.mail.util.LineInputStream, java.io.InputStream] */
    static {
        ?? lineInputStream;
        Throwable th;
        try {
            InputStream resourceAsStream = MimeUtility.class.getResourceAsStream("/META-INF/javamail.charset.map");
            if (resourceAsStream != null) {
                try {
                    lineInputStream = new LineInputStream(resourceAsStream);
                } catch (Throwable th2) {
                    lineInputStream = resourceAsStream;
                    th = th2;
                }
                try {
                    loadMappings(lineInputStream, java2mime);
                    loadMappings(lineInputStream, mime2java);
                    lineInputStream.close();
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        lineInputStream.close();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            }
        } catch (Exception unused2) {
        }
        if (java2mime.isEmpty()) {
            java2mime.put("8859_1", "ISO-8859-1");
            java2mime.put("iso8859_1", "ISO-8859-1");
            java2mime.put("iso8859-1", "ISO-8859-1");
            java2mime.put("8859_2", "ISO-8859-2");
            java2mime.put("iso8859_2", "ISO-8859-2");
            java2mime.put("iso8859-2", "ISO-8859-2");
            java2mime.put("8859_3", "ISO-8859-3");
            java2mime.put("iso8859_3", "ISO-8859-3");
            java2mime.put("iso8859-3", "ISO-8859-3");
            java2mime.put("8859_4", "ISO-8859-4");
            java2mime.put("iso8859_4", "ISO-8859-4");
            java2mime.put("iso8859-4", "ISO-8859-4");
            java2mime.put("8859_5", "ISO-8859-5");
            java2mime.put("iso8859_5", "ISO-8859-5");
            java2mime.put("iso8859-5", "ISO-8859-5");
            java2mime.put("8859_6", "ISO-8859-6");
            java2mime.put("iso8859_6", "ISO-8859-6");
            java2mime.put("iso8859-6", "ISO-8859-6");
            java2mime.put("8859_7", "ISO-8859-7");
            java2mime.put("iso8859_7", "ISO-8859-7");
            java2mime.put("iso8859-7", "ISO-8859-7");
            java2mime.put("8859_8", "ISO-8859-8");
            java2mime.put("iso8859_8", "ISO-8859-8");
            java2mime.put("iso8859-8", "ISO-8859-8");
            java2mime.put("8859_9", "ISO-8859-9");
            java2mime.put("iso8859_9", "ISO-8859-9");
            java2mime.put("iso8859-9", "ISO-8859-9");
            java2mime.put("sjis", "Shift_JIS");
            java2mime.put("jis", "ISO-2022-JP");
            java2mime.put("iso2022jp", "ISO-2022-JP");
            java2mime.put("euc_jp", "euc-jp");
            java2mime.put("koi8_r", "koi8-r");
            java2mime.put("euc_cn", "euc-cn");
            java2mime.put("euc_tw", "euc-tw");
            java2mime.put("euc_kr", "euc-kr");
        }
        if (mime2java.isEmpty()) {
            mime2java.put("iso-2022-cn", "ISO2022CN");
            mime2java.put("iso-2022-kr", "ISO2022KR");
            mime2java.put("utf-8", "UTF8");
            mime2java.put("utf8", "UTF8");
            mime2java.put("ja_jp.iso2022-7", "ISO2022JP");
            mime2java.put("ja_jp.eucjp", "EUCJIS");
            mime2java.put("euc-kr", "KSC5601");
            mime2java.put("euckr", "KSC5601");
            mime2java.put("us-ascii", "ISO-8859-1");
            mime2java.put("x-us-ascii", "ISO-8859-1");
            mime2java.put("gb2312", "GB18030");
            mime2java.put("cp936", "GB18030");
            mime2java.put("ms936", "GB18030");
            mime2java.put("gbk", "GB18030");
        }
    }

    private MimeUtility() {
    }

    public static int checkAscii(InputStream inputStream, int i, boolean z) {
        int i2 = i;
        int i3 = 0;
        boolean z3 = encodeEolStrict && z;
        byte[] bArr = null;
        int i4 = -1;
        if (i2 != 0) {
            iMin = i2 != -1 ? Math.min(i2, 4096) : 4096;
            bArr = new byte[iMin];
        }
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        while (i2 != 0) {
            try {
                int i8 = inputStream.read(bArr, i3, iMin);
                if (i8 == i4) {
                    break;
                }
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = bArr[i9] & 255;
                    if (z3 && ((i3 == 13 && i10 != 10) || (i3 != 13 && i10 == 10))) {
                        z4 = true;
                    }
                    if (i10 == 13 || i10 == 10) {
                        i7 = 0;
                    } else {
                        i7++;
                        if (i7 > 998) {
                            z5 = true;
                        }
                    }
                    if (!nonascii(i10)) {
                        i5++;
                    } else {
                        if (z) {
                            return 3;
                        }
                        i6++;
                    }
                    i9++;
                    i3 = i10;
                }
                if (i2 != -1) {
                    i2 -= i8;
                }
                i3 = 0;
                i4 = -1;
            } catch (IOException unused) {
            }
        }
        if (i2 == 0 && z) {
            return 3;
        }
        if (i6 != 0) {
            return i5 > i6 ? 2 : 3;
        }
        if (z4) {
            return 3;
        }
        return z5 ? 2 : 1;
    }

    public static int checkAscii(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (nonascii(str.charAt(i3))) {
                i++;
            } else {
                i2++;
            }
        }
        if (i == 0) {
            return 1;
        }
        return i2 > i ? 2 : 3;
    }

    public static int checkAscii(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            if (nonascii(b & 255)) {
                i++;
            } else {
                i2++;
            }
        }
        if (i == 0) {
            return 1;
        }
        return i2 > i ? 2 : 3;
    }

    public static InputStream decode(InputStream inputStream, String str) throws MessagingException {
        if (str.equalsIgnoreCase("base64")) {
            return new BASE64DecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("quoted-printable")) {
            return new QPDecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
            return new UUDecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase(MIME.ENC_BINARY) || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase(MIME.ENC_8BIT) || ignoreUnknownEncoding) {
            return inputStream;
        }
        throw new MessagingException("Unknown encoding: ".concat(String.valueOf(str)));
    }

    private static String decodeInnerWords(String str) throws UnsupportedEncodingException {
        int iIndexOf;
        int iIndexOf2;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int iIndexOf3 = str.indexOf("=?", i);
            if (iIndexOf3 < 0) {
                break;
            }
            sb.append(str.substring(i, iIndexOf3));
            int iIndexOf4 = str.indexOf(63, iIndexOf3 + 2);
            if (iIndexOf4 < 0 || (iIndexOf = str.indexOf(63, iIndexOf4 + 1)) < 0 || (iIndexOf2 = str.indexOf("?=", iIndexOf + 1)) < 0) {
                break;
            }
            i = iIndexOf2 + 2;
            String strSubstring = str.substring(iIndexOf3, i);
            try {
                strSubstring = decodeWord(strSubstring);
            } catch (ParseException unused) {
            }
            sb.append(strSubstring);
        }
        if (i == 0) {
            return str;
        }
        if (i < str.length()) {
            sb.append(str.substring(i));
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String decodeText(java.lang.String r9) throws java.io.UnsupportedEncodingException {
        /*
            java.lang.String r0 = "=?"
            int r1 = r9.indexOf(r0)
            r2 = -1
            if (r1 != r2) goto La
            return r9
        La:
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            java.lang.String r2 = " \t\n\r"
            r3 = 1
            r1.<init>(r9, r2, r3)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4 = 0
            r5 = 0
        L1e:
            boolean r6 = r1.hasMoreTokens()
            if (r6 == 0) goto L8f
            java.lang.String r6 = r1.nextToken()
            char r7 = r6.charAt(r4)
            r8 = 32
            if (r7 == r8) goto L8b
            r8 = 9
            if (r7 == r8) goto L8b
            r8 = 13
            if (r7 == r8) goto L8b
            r8 = 10
            if (r7 != r8) goto L3d
            goto L8b
        L3d:
            java.lang.String r7 = decodeWord(r6)     // Catch: javax.mail.internet.ParseException -> L4f
            if (r5 != 0) goto L4c
            int r8 = r2.length()     // Catch: javax.mail.internet.ParseException -> L4f
            if (r8 <= 0) goto L4c
            r9.append(r2)     // Catch: javax.mail.internet.ParseException -> L4f
        L4c:
            r6 = r7
            r5 = 1
            goto L84
        L4f:
            boolean r7 = javax.mail.internet.MimeUtility.decodeStrict
            if (r7 != 0) goto L7a
            java.lang.String r7 = decodeInnerWords(r6)
            if (r7 == r6) goto L73
            if (r5 == 0) goto L62
            boolean r5 = r6.startsWith(r0)
            if (r5 != 0) goto L6b
        L62:
            int r5 = r2.length()
            if (r5 <= 0) goto L6b
            r9.append(r2)
        L6b:
            java.lang.String r5 = "?="
            boolean r5 = r6.endsWith(r5)
            r6 = r7
            goto L84
        L73:
            int r5 = r2.length()
            if (r5 <= 0) goto L83
            goto L80
        L7a:
            int r5 = r2.length()
            if (r5 <= 0) goto L83
        L80:
            r9.append(r2)
        L83:
            r5 = 0
        L84:
            r9.append(r6)
            r2.setLength(r4)
            goto L1e
        L8b:
            r2.append(r7)
            goto L1e
        L8f:
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MimeUtility.decodeText(java.lang.String):java.lang.String");
    }

    public static String decodeWord(String str) throws ParseException, UnsupportedEncodingException {
        InputStream qDecoderStream;
        if (!str.startsWith("=?")) {
            throw new ParseException("encoded word does not start with \"=?\": ".concat(String.valueOf(str)));
        }
        int iIndexOf = str.indexOf(63, 2);
        if (iIndexOf == -1) {
            throw new ParseException("encoded word does not include charset: ".concat(String.valueOf(str)));
        }
        String strSubstring = str.substring(2, iIndexOf);
        int iIndexOf2 = strSubstring.indexOf(42);
        if (iIndexOf2 >= 0) {
            strSubstring = strSubstring.substring(0, iIndexOf2);
        }
        String strJavaCharset = javaCharset(strSubstring);
        int i = iIndexOf + 1;
        int iIndexOf3 = str.indexOf(63, i);
        if (iIndexOf3 == -1) {
            throw new ParseException("encoded word does not include encoding: ".concat(String.valueOf(str)));
        }
        String strSubstring2 = str.substring(i, iIndexOf3);
        int i2 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf("?=", i2);
        if (iIndexOf4 == -1) {
            throw new ParseException("encoded word does not end with \"?=\": ".concat(String.valueOf(str)));
        }
        String strSubstring3 = str.substring(i2, iIndexOf4);
        try {
            String str2 = "";
            if (strSubstring3.length() > 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ASCIIUtility.getBytes(strSubstring3));
                if (strSubstring2.equalsIgnoreCase("B")) {
                    qDecoderStream = new BASE64DecoderStream(byteArrayInputStream);
                } else {
                    if (!strSubstring2.equalsIgnoreCase("Q")) {
                        throw new UnsupportedEncodingException("unknown encoding: ".concat(String.valueOf(strSubstring2)));
                    }
                    qDecoderStream = new QDecoderStream(byteArrayInputStream);
                }
                int iAvailable = byteArrayInputStream.available();
                byte[] bArr = new byte[iAvailable];
                int i3 = qDecoderStream.read(bArr, 0, iAvailable);
                if (i3 > 0) {
                    str2 = new String(bArr, 0, i3, strJavaCharset);
                }
            }
            int i4 = iIndexOf4 + 2;
            if (i4 >= str.length()) {
                return str2;
            }
            String strSubstring4 = str.substring(i4);
            if (!decodeStrict) {
                strSubstring4 = decodeInnerWords(strSubstring4);
            }
            return str2 + strSubstring4;
        } catch (UnsupportedEncodingException e) {
            throw e;
        } catch (IOException e2) {
            throw new ParseException(e2.toString());
        } catch (IllegalArgumentException unused) {
            throw new UnsupportedEncodingException(strJavaCharset);
        }
    }

    private static void doEncode(String str, boolean z, String str2, int i, String str3, boolean z3, boolean z4, StringBuilder sb) throws UnsupportedEncodingException {
        byte[] bytes;
        int length;
        String strSubstring = str;
        boolean z5 = z3;
        while (true) {
            bytes = strSubstring.getBytes(str2);
            if ((z ? BEncoderStream.encodedLength(bytes) : QEncoderStream.encodedLength(bytes, z4)) <= i || (length = strSubstring.length()) <= 1) {
                break;
            }
            int i2 = length / 2;
            if (Character.isHighSurrogate(strSubstring.charAt(i2 - 1))) {
                i2--;
            }
            int i3 = i2;
            if (i3 > 0) {
                doEncode(strSubstring.substring(0, i3), z, str2, i, str3, z5, z4, sb);
            }
            strSubstring = strSubstring.substring(i3, length);
            z5 = false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream bEncoderStream = z ? new BEncoderStream(byteArrayOutputStream) : new QEncoderStream(byteArrayOutputStream, z4);
        try {
            bEncoderStream.write(bytes);
            bEncoderStream.close();
        } catch (IOException unused) {
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (!z5) {
            sb.append(foldEncodedWords ? "\r\n " : C4196o4.OooO00o.OooO0Oo);
        }
        sb.append(str3);
        for (byte b : byteArray) {
            sb.append((char) b);
        }
        sb.append("?=");
    }

    public static OutputStream encode(OutputStream outputStream, String str) throws MessagingException {
        if (str == null) {
            return outputStream;
        }
        if (str.equalsIgnoreCase("base64")) {
            return new BASE64EncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("quoted-printable")) {
            return new QPEncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
            return new UUEncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase(MIME.ENC_BINARY) || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase(MIME.ENC_8BIT)) {
            return outputStream;
        }
        throw new MessagingException("Unknown encoding: ".concat(String.valueOf(str)));
    }

    public static OutputStream encode(OutputStream outputStream, String str, String str2) throws MessagingException {
        if (str == null) {
            return outputStream;
        }
        if (str.equalsIgnoreCase("base64")) {
            return new BASE64EncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("quoted-printable")) {
            return new QPEncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
            return new UUEncoderStream(outputStream, str2);
        }
        if (str.equalsIgnoreCase(MIME.ENC_BINARY) || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase(MIME.ENC_8BIT)) {
            return outputStream;
        }
        throw new MessagingException("Unknown encoding: ".concat(String.valueOf(str)));
    }

    public static String encodeText(String str) throws UnsupportedEncodingException {
        return encodeText(str, null, null);
    }

    public static String encodeText(String str, String str2, String str3) throws UnsupportedEncodingException {
        return encodeWord(str, str2, str3, false);
    }

    public static String encodeWord(String str) throws UnsupportedEncodingException {
        return encodeWord(str, null, null);
    }

    public static String encodeWord(String str, String str2, String str3) throws UnsupportedEncodingException {
        return encodeWord(str, str2, str3, true);
    }

    private static String encodeWord(String str, String str2, String str3, boolean z) throws UnsupportedEncodingException {
        String strJavaCharset;
        boolean z3;
        int iCheckAscii = checkAscii(str);
        if (iCheckAscii == 1) {
            return str;
        }
        if (str2 == null) {
            strJavaCharset = getDefaultJavaCharset();
            str2 = getDefaultMIMECharset();
        } else {
            strJavaCharset = javaCharset(str2);
        }
        if (str3 == null) {
            str3 = iCheckAscii != 3 ? "Q" : "B";
        }
        if (str3.equalsIgnoreCase("B")) {
            z3 = true;
        } else {
            if (!str3.equalsIgnoreCase("Q")) {
                throw new UnsupportedEncodingException("Unknown transfer encoding: ".concat(String.valueOf(str3)));
            }
            z3 = false;
        }
        StringBuilder sb = new StringBuilder();
        doEncode(str, z3, strJavaCharset, 68 - str2.length(), "=?" + str2 + "?" + str3 + "?", true, z, sb);
        return sb.toString();
    }

    public static String fold(int i, String str) {
        char cCharAt;
        if (!foldText) {
            return str;
        }
        int length = str.length() - 1;
        while (length >= 0 && ((cCharAt = str.charAt(length)) == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
            length--;
        }
        if (length != str.length() - 1) {
            str = str.substring(0, length + 1);
        }
        if (str.length() + i <= 76) {
            return makesafe(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 4);
        char cCharAt2 = 0;
        while (true) {
            if (str.length() + i <= 76) {
                break;
            }
            int i2 = 0;
            int i3 = -1;
            while (i2 < str.length() && (i3 == -1 || i + i2 <= 76)) {
                char cCharAt3 = str.charAt(i2);
                if ((cCharAt3 == ' ' || cCharAt3 == '\t') && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    i3 = i2;
                }
                i2++;
                cCharAt2 = cCharAt3;
            }
            if (i3 == -1) {
                sb.append(str);
                str = "";
                break;
            }
            sb.append(str.substring(0, i3));
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            cCharAt2 = str.charAt(i3);
            sb.append(cCharAt2);
            str = str.substring(i3 + 1);
            i = 1;
        }
        sb.append(str);
        return makesafe(sb);
    }

    public static String getDefaultJavaCharset() {
        if (defaultJavaCharset == null) {
            String property = null;
            try {
                property = System.getProperty("mail.mime.charset");
            } catch (SecurityException unused) {
            }
            if (property != null && property.length() > 0) {
                String strJavaCharset = javaCharset(property);
                defaultJavaCharset = strJavaCharset;
                return strJavaCharset;
            }
            try {
                defaultJavaCharset = System.getProperty("file.encoding", "8859_1");
            } catch (SecurityException unused2) {
                String encoding = new InputStreamReader(new InputStream() { // from class: javax.mail.internet.MimeUtility.1NullInputStream
                    @Override // java.io.InputStream
                    public int read() {
                        return 0;
                    }
                }).getEncoding();
                defaultJavaCharset = encoding;
                if (encoding == null) {
                    defaultJavaCharset = "8859_1";
                }
            }
        }
        return defaultJavaCharset;
    }

    public static String getDefaultMIMECharset() {
        if (defaultMIMECharset == null) {
            try {
                defaultMIMECharset = System.getProperty("mail.mime.charset");
            } catch (SecurityException unused) {
            }
        }
        if (defaultMIMECharset == null) {
            defaultMIMECharset = mimeCharset(getDefaultJavaCharset());
        }
        return defaultMIMECharset;
    }

    public static String getEncoding(DataHandler dataHandler) {
        if (dataHandler.getName() != null) {
            return getEncoding(dataHandler.getDataSource());
        }
        try {
            if (new ContentType(dataHandler.getContentType()).match("text/*")) {
                AsciiOutputStream asciiOutputStream = new AsciiOutputStream(false, false);
                try {
                    dataHandler.writeTo(asciiOutputStream);
                } catch (IOException unused) {
                }
                int ascii = asciiOutputStream.getAscii();
                if (ascii != 1) {
                    return ascii != 2 ? "base64" : "quoted-printable";
                }
            } else {
                AsciiOutputStream asciiOutputStream2 = new AsciiOutputStream(true, encodeEolStrict);
                try {
                    dataHandler.writeTo(asciiOutputStream2);
                } catch (IOException unused2) {
                }
                if (asciiOutputStream2.getAscii() != 1) {
                    return "base64";
                }
            }
            return "7bit";
        } catch (Exception unused3) {
            return "base64";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getEncoding(javax.activation.DataSource r6) {
        /*
            java.lang.String r0 = "base64"
            boolean r1 = r6 instanceof javax.mail.EncodingAware
            if (r1 == 0) goto L10
            r1 = r6
            javax.mail.EncodingAware r1 = (javax.mail.EncodingAware) r1
            java.lang.String r1 = r1.getEncoding()
            if (r1 == 0) goto L10
            return r1
        L10:
            r1 = 0
            javax.mail.internet.ContentType r2 = new javax.mail.internet.ContentType     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L50
            java.lang.String r3 = r6.getContentType()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L50
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L50
            java.io.InputStream r1 = r6.getInputStream()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L50
            java.lang.String r6 = "text/*"
            boolean r6 = r2.match(r6)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L50
            r3 = -1
            r4 = 1
            if (r6 != 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            int r3 = checkAscii(r1, r3, r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L50
            if (r3 == r4) goto L41
            r4 = 2
            if (r3 == r4) goto L35
            goto L43
        L35:
            if (r6 == 0) goto L3e
            boolean r6 = nonAsciiCharset(r2)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L50
            if (r6 == 0) goto L3e
            goto L43
        L3e:
            java.lang.String r0 = "quoted-printable"
            goto L43
        L41:
            java.lang.String r0 = "7bit"
        L43:
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.io.IOException -> L48
        L48:
            return r0
        L49:
            r6 = move-exception
            if (r1 == 0) goto L4f
            r1.close()     // Catch: java.io.IOException -> L4f
        L4f:
            throw r6
        L50:
            if (r1 == 0) goto L55
            r1.close()     // Catch: java.io.IOException -> L55
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MimeUtility.getEncoding(javax.activation.DataSource):java.lang.String");
    }

    private static int indexOfAny(String str, String str2) {
        return indexOfAny(str, str2, 0);
    }

    private static int indexOfAny(String str, String str2, int i) {
        try {
            int length = str.length();
            while (i < length) {
                if (str2.indexOf(str.charAt(i)) >= 0) {
                    return i;
                }
                i++;
            }
        } catch (StringIndexOutOfBoundsException unused) {
        }
        return -1;
    }

    public static String javaCharset(String str) {
        Map<String, String> map = mime2java;
        if (map == null || str == null) {
            return str;
        }
        String str2 = map.get(str.toLowerCase(Locale.ENGLISH));
        if (str2 != null) {
            try {
                Charset.forName(str2);
            } catch (Exception unused) {
                str2 = null;
            }
        }
        return str2 == null ? str : str2;
    }

    private static void loadMappings(LineInputStream lineInputStream, Map<String, String> map) {
        while (true) {
            try {
                String line = lineInputStream.readLine();
                if (line == null) {
                    return;
                }
                if (line.startsWith("--") && line.endsWith("--")) {
                    return;
                }
                if (line.trim().length() != 0 && !line.startsWith("#")) {
                    StringTokenizer stringTokenizer = new StringTokenizer(line, " \t");
                    try {
                        String strNextToken = stringTokenizer.nextToken();
                        map.put(strNextToken.toLowerCase(Locale.ENGLISH), stringTokenizer.nextToken());
                    } catch (NoSuchElementException unused) {
                    }
                }
            } catch (IOException unused2) {
                return;
            }
        }
    }

    private static String makesafe(CharSequence charSequence) {
        char cCharAt;
        int i = 0;
        while (i < charSequence.length() && (cCharAt = charSequence.charAt(i)) != '\r' && cCharAt != '\n') {
            i++;
        }
        if (i == charSequence.length()) {
            return charSequence.toString();
        }
        StringBuilder sb = new StringBuilder(charSequence.length() + 1);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(charSequence.toString()));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb.toString();
                }
                if (line.trim().length() != 0) {
                    if (sb.length() > 0) {
                        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
                        char cCharAt2 = line.charAt(0);
                        if (cCharAt2 != ' ' && cCharAt2 != '\t') {
                            sb.append(' ');
                        }
                    }
                    sb.append(line);
                }
            } catch (IOException unused) {
                return charSequence.toString();
            }
        }
    }

    public static String mimeCharset(String str) {
        String str2;
        Map<String, String> map = java2mime;
        return (map == null || str == null || (str2 = map.get(str.toLowerCase(Locale.ENGLISH))) == null) ? str : str2;
    }

    private static boolean nonAsciiCharset(ContentType contentType) {
        Boolean bool;
        Boolean boolValueOf;
        String parameter = contentType.getParameter(HttpRequest.PARAM_CHARSET);
        if (parameter == null) {
            return false;
        }
        String lowerCase = parameter.toLowerCase(Locale.ENGLISH);
        Map<String, Boolean> map = nonAsciiCharsetMap;
        synchronized (map) {
            bool = map.get(lowerCase);
        }
        if (bool == null) {
            try {
                byte[] bytes = IOUtils.LINE_SEPARATOR_WINDOWS.getBytes(lowerCase);
                boolValueOf = Boolean.valueOf((bytes.length == 2 && bytes[0] == 13 && bytes[1] == 10) ? false : true);
            } catch (UnsupportedEncodingException unused) {
                boolValueOf = Boolean.FALSE;
            } catch (RuntimeException unused2) {
                boolValueOf = Boolean.TRUE;
            }
            bool = boolValueOf;
            Map<String, Boolean> map2 = nonAsciiCharsetMap;
            synchronized (map2) {
                map2.put(lowerCase, bool);
            }
        }
        return bool.booleanValue();
    }

    public static final boolean nonascii(int i) {
        if (i < 127) {
            return (i >= 32 || i == 13 || i == 10 || i == 9) ? false : true;
        }
        return true;
    }

    public static String quote(String str, String str2) {
        StringBuilder sb;
        char c = 0;
        int length = str == null ? 0 : str.length();
        if (length == 0) {
            return "\"\"";
        }
        int i = 0;
        boolean z = false;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"' || cCharAt == '\\' || cCharAt == '\r' || cCharAt == '\n') {
                sb = new StringBuilder(length + 3);
                sb.append('\"');
                sb.append(str.substring(0, i));
                while (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if ((cCharAt2 == '\"' || cCharAt2 == '\\' || cCharAt2 == '\r' || cCharAt2 == '\n') && (cCharAt2 != '\n' || c != '\r')) {
                        sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    }
                    sb.append(cCharAt2);
                    i++;
                    c = cCharAt2;
                }
                sb.append('\"');
                return sb.toString();
            }
            if (cCharAt < ' ' || ((cCharAt >= 127 && !allowUtf8) || str2.indexOf(cCharAt) >= 0)) {
                z = true;
            }
            i++;
        }
        if (!z) {
            return str;
        }
        sb = new StringBuilder(length + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String unfold(java.lang.String r8) {
        /*
            boolean r0 = javax.mail.internet.MimeUtility.foldText
            if (r0 != 0) goto L5
            return r8
        L5:
            r0 = 0
        L6:
            java.lang.String r1 = "\r\n"
            int r1 = indexOfAny(r8, r1)
            if (r1 < 0) goto L84
            int r2 = r8.length()
            int r3 = r1 + 1
            if (r3 >= r2) goto L2a
            int r4 = r3 + (-1)
            char r4 = r8.charAt(r4)
            r5 = 13
            if (r4 != r5) goto L2a
            char r4 = r8.charAt(r3)
            r5 = 10
            if (r4 != r5) goto L2a
            int r3 = r3 + 1
        L2a:
            r4 = 0
            if (r1 <= 0) goto L4e
            int r5 = r1 + (-1)
            char r6 = r8.charAt(r5)
            r7 = 92
            if (r6 != r7) goto L4e
            if (r0 != 0) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r2 = r8.length()
            r0.<init>(r2)
        L42:
            java.lang.String r2 = r8.substring(r4, r5)
            r0.append(r2)
            java.lang.String r1 = r8.substring(r1, r3)
            goto L7c
        L4e:
            if (r3 >= r2) goto L6d
            char r2 = r8.charAt(r3)
            r5 = 32
            if (r2 == r5) goto L6d
            r5 = 9
            if (r2 != r5) goto L5d
            goto L6d
        L5d:
            if (r0 != 0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r8.length()
            r0.<init>(r1)
        L68:
            java.lang.String r1 = r8.substring(r4, r3)
            goto L7c
        L6d:
            if (r0 != 0) goto L78
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r2 = r8.length()
            r0.<init>(r2)
        L78:
            java.lang.String r1 = r8.substring(r4, r1)
        L7c:
            r0.append(r1)
            java.lang.String r8 = r8.substring(r3)
            goto L6
        L84:
            if (r0 == 0) goto L8d
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L8d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MimeUtility.unfold(java.lang.String):java.lang.String");
    }
}
