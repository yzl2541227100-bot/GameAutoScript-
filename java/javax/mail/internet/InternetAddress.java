package javax.mail.internet;

import com.sun.mail.util.PropUtil;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import javax.mail.Address;
import javax.mail.Session;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: loaded from: classes2.dex */
public class InternetAddress extends Address implements Cloneable {
    private static final long serialVersionUID = -7507595530758302903L;
    private static final String specialsNoDot = "()<>,;:\\\"[]@";
    private static final String specialsNoDotNoAt = "()<>,;:\\\"[]";
    public String address;
    public String encodedPersonal;
    public String personal;
    private static final boolean ignoreBogusGroupName = PropUtil.getBooleanSystemProperty("mail.mime.address.ignorebogusgroupname", true);
    private static final boolean useCanonicalHostName = PropUtil.getBooleanSystemProperty("mail.mime.address.usecanonicalhostname", true);
    private static final boolean allowUtf8 = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", false);
    private static final String rfc822phrase = HeaderTokenizer.RFC822.replace(' ', (char) 0).replace('\t', (char) 0);

    public InternetAddress() {
    }

    public InternetAddress(String str) throws AddressException {
        InternetAddress[] internetAddressArr = parse(str, true);
        if (internetAddressArr.length != 1) {
            throw new AddressException("Illegal address", str);
        }
        this.address = internetAddressArr[0].address;
        this.personal = internetAddressArr[0].personal;
        this.encodedPersonal = internetAddressArr[0].encodedPersonal;
    }

    public InternetAddress(String str, String str2) throws UnsupportedEncodingException {
        this(str, str2, null);
    }

    public InternetAddress(String str, String str2, String str3) throws UnsupportedEncodingException {
        this.address = str;
        setPersonal(str2, str3);
    }

    public InternetAddress(String str, boolean z) throws AddressException {
        this(str);
        if (z) {
            if (isGroup()) {
                getGroup(true);
            } else {
                checkAddress(this.address, true, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static javax.mail.internet.InternetAddress _getLocalAddress(javax.mail.Session r6) throws javax.mail.internet.AddressException, java.lang.SecurityException, java.net.UnknownHostException {
        /*
            java.lang.String r0 = "user.name"
            r1 = 0
            if (r6 != 0) goto Lb
            java.lang.String r6 = java.lang.System.getProperty(r0)
            r2 = r1
            goto L43
        Lb:
            java.lang.String r2 = "mail.from"
            java.lang.String r2 = r6.getProperty(r2)
            if (r2 != 0) goto L4b
            java.lang.String r3 = "mail.user"
            java.lang.String r3 = r6.getProperty(r3)
            if (r3 == 0) goto L21
            int r4 = r3.length()
            if (r4 != 0) goto L25
        L21:
            java.lang.String r3 = r6.getProperty(r0)
        L25:
            if (r3 == 0) goto L30
            int r4 = r3.length()
            if (r4 != 0) goto L2e
            goto L30
        L2e:
            r0 = r3
            goto L34
        L30:
            java.lang.String r0 = java.lang.System.getProperty(r0)
        L34:
            java.lang.String r3 = "mail.host"
            java.lang.String r6 = r6.getProperty(r3)
            if (r6 == 0) goto L42
            int r3 = r6.length()
            if (r3 != 0) goto L4d
        L42:
            r6 = r0
        L43:
            java.lang.String r0 = getLocalHostName()
            r5 = r0
            r0 = r6
            r6 = r5
            goto L4d
        L4b:
            r6 = r1
            r0 = r6
        L4d:
            if (r2 != 0) goto L7d
            if (r0 == 0) goto L7d
            int r3 = r0.length()
            if (r3 == 0) goto L7d
            if (r6 == 0) goto L7d
            int r3 = r6.length()
            if (r3 == 0) goto L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.trim()
            java.lang.String r3 = "()<>,;:\\\"[]@\t "
            java.lang.String r0 = javax.mail.internet.MimeUtility.quote(r0, r3)
            r2.append(r0)
            java.lang.String r0 = "@"
            r2.append(r0)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
        L7d:
            if (r2 != 0) goto L80
            return r1
        L80:
            javax.mail.internet.InternetAddress r6 = new javax.mail.internet.InternetAddress
            r6.<init>(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.InternetAddress._getLocalAddress(javax.mail.Session):javax.mail.internet.InternetAddress");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0127, code lost:
    
        if (r16.charAt(r8) == '.') goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0129, code lost:
    
        r2 = r8;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x012b, code lost:
    
        if (r2 >= r1) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x012d, code lost:
    
        r6 = r16.charAt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0133, code lost:
    
        if (r6 != '[') goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0135, code lost:
    
        if (r2 != r8) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0137, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0140, code lost:
    
        throw new javax.mail.internet.AddressException("Domain literal not at start of domain", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0143, code lost:
    
        if (r6 != ']') goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0147, code lost:
    
        if (r2 != (r1 - 1)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0149, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0152, code lost:
    
        throw new javax.mail.internet.AddressException("Domain literal end not at end of domain", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0153, code lost:
    
        if (r6 <= ' ') goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0155, code lost:
    
        if (r6 == 127) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0157, code lost:
    
        if (r5 != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x015d, code lost:
    
        if (java.lang.Character.isLetterOrDigit(r6) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0161, code lost:
    
        if (r6 == '-') goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0163, code lost:
    
        if (r6 != '.') goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x016d, code lost:
    
        throw new javax.mail.internet.AddressException("Domain contains illegal character", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016e, code lost:
    
        if (r6 != '.') goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0170, code lost:
    
        if (r7 == '.') goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x017a, code lost:
    
        throw new javax.mail.internet.AddressException("Domain contains dot-dot", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x017b, code lost:
    
        r2 = r2 + 1;
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0186, code lost:
    
        throw new javax.mail.internet.AddressException("Domain contains control or whitespace", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0187, code lost:
    
        if (r7 == '.') goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0189, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0191, code lost:
    
        throw new javax.mail.internet.AddressException("Domain ends with dot", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0199, code lost:
    
        throw new javax.mail.internet.AddressException("Domain starts with dot", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a1, code lost:
    
        throw new javax.mail.internet.AddressException("Missing domain", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01a9, code lost:
    
        throw new javax.mail.internet.AddressException("Unterminated quote", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0109, code lost:
    
        throw new javax.mail.internet.AddressException("Local address contains control or whitespace", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0111, code lost:
    
        if (r9 != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0113, code lost:
    
        if (r6 == '@') goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0115, code lost:
    
        if (r18 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0117, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x011f, code lost:
    
        throw new javax.mail.internet.AddressException("Missing final '@domain'", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0120, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0121, code lost:
    
        if (r8 >= r1) goto L142;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void checkAddress(java.lang.String r16, boolean r17, boolean r18) throws javax.mail.internet.AddressException {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.InternetAddress.checkAddress(java.lang.String, boolean, boolean):void");
    }

    public static InternetAddress getLocalAddress(Session session) {
        try {
            return _getLocalAddress(session);
        } catch (SecurityException | UnknownHostException | AddressException unused) {
            return null;
        }
    }

    private static String getLocalHostName() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        if (localHost == null) {
            return null;
        }
        String canonicalHostName = useCanonicalHostName ? localHost.getCanonicalHostName() : null;
        if (canonicalHostName == null) {
            canonicalHostName = localHost.getHostName();
        }
        if (canonicalHostName == null) {
            canonicalHostName = localHost.getHostAddress();
        }
        if (canonicalHostName == null || canonicalHostName.length() <= 0 || !isInetAddressLiteral(canonicalHostName)) {
            return canonicalHostName;
        }
        return "[" + canonicalHostName + ']';
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

    private static boolean isInetAddressLiteral(String str) {
        boolean z = false;
        boolean z3 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.') {
                if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                    z = true;
                } else {
                    if (cCharAt != ':') {
                        return false;
                    }
                    z3 = true;
                }
            }
        }
        return !z || z3;
    }

    private boolean isSimple() {
        String str = this.address;
        return str == null || indexOfAny(str, specialsNoDotNoAt) < 0;
    }

    private static int lengthOfFirstSegment(String str) {
        int iIndexOf = str.indexOf(IOUtils.LINE_SEPARATOR_WINDOWS);
        return iIndexOf != -1 ? iIndexOf : str.length();
    }

    private static int lengthOfLastSegment(String str, int i) {
        return str.lastIndexOf(IOUtils.LINE_SEPARATOR_WINDOWS) != -1 ? (r2 - r0) - 2 : str.length() + i;
    }

    public static InternetAddress[] parse(String str) throws AddressException {
        return parse(str, true);
    }

    public static InternetAddress[] parse(String str, boolean z) throws AddressException {
        return parse(str, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0256 A[PHI: r2 r8 r9 r13
  0x0256: PHI (r2v37 int) = (r2v33 int), (r2v41 int) binds: [B:198:0x0248, B:184:0x0226] A[DONT_GENERATE, DONT_INLINE]
  0x0256: PHI (r8v16 int) = (r8v14 int), (r8v1 int) binds: [B:198:0x0248, B:184:0x0226] A[DONT_GENERATE, DONT_INLINE]
  0x0256: PHI (r9v11 int) = (r9v1 int), (r9v12 int) binds: [B:198:0x0248, B:184:0x0226] A[DONT_GENERATE, DONT_INLINE]
  0x0256: PHI (r13v7 int) = (r13v1 int), (r13v8 int) binds: [B:198:0x0248, B:184:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static javax.mail.internet.InternetAddress[] parse(java.lang.String r19, boolean r20, boolean r21) throws javax.mail.internet.AddressException {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.InternetAddress.parse(java.lang.String, boolean, boolean):javax.mail.internet.InternetAddress[]");
    }

    public static InternetAddress[] parseHeader(String str, boolean z) throws AddressException {
        return parse(MimeUtility.unfold(str), z, true);
    }

    private static String quotePhrase(String str) {
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"' || cCharAt == '\\') {
                StringBuilder sb = new StringBuilder(length + 3);
                sb.append('\"');
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 == '\"' || cCharAt2 == '\\') {
                        sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    }
                    sb.append(cCharAt2);
                }
                sb.append('\"');
                return sb.toString();
            }
            if ((cCharAt < ' ' && cCharAt != '\r' && cCharAt != '\n' && cCharAt != '\t') || ((cCharAt >= 127 && !allowUtf8) || rfc822phrase.indexOf(cCharAt) >= 0)) {
                z = true;
            }
        }
        if (!z) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(length + 2);
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return sb2.toString();
    }

    public static String toString(Address[] addressArr) {
        return toString(addressArr, 0);
    }

    public static String toString(Address[] addressArr, int i) {
        if (addressArr == null || addressArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < addressArr.length; i2++) {
            if (i2 != 0) {
                sb.append(", ");
                i += 2;
            }
            String strFold = MimeUtility.fold(0, addressArr[i2].toString());
            if (lengthOfFirstSegment(strFold) + i > 76) {
                int length = sb.length();
                if (length > 0) {
                    int i3 = length - 1;
                    if (sb.charAt(i3) == ' ') {
                        sb.setLength(i3);
                    }
                }
                sb.append("\r\n\t");
                i = 8;
            }
            sb.append(strFold);
            i = lengthOfLastSegment(strFold, i);
        }
        return sb.toString();
    }

    public static String toUnicodeString(Address[] addressArr) {
        return toUnicodeString(addressArr, 0);
    }

    public static String toUnicodeString(Address[] addressArr, int i) {
        if (addressArr == null || addressArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i2 = 0; i2 < addressArr.length; i2++) {
            if (i2 != 0) {
                sb.append(", ");
                i += 2;
            }
            String unicodeString = ((InternetAddress) addressArr[i2]).toUnicodeString();
            if (MimeUtility.checkAscii(unicodeString) != 1) {
                unicodeString = new String(unicodeString.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
                z = true;
            }
            String strFold = MimeUtility.fold(0, unicodeString);
            if (lengthOfFirstSegment(strFold) + i > 76) {
                int length = sb.length();
                if (length > 0) {
                    int i3 = length - 1;
                    if (sb.charAt(i3) == ' ') {
                        sb.setLength(i3);
                    }
                }
                sb.append("\r\n\t");
                i = 8;
            }
            sb.append(strFold);
            i = lengthOfLastSegment(strFold, i);
        }
        String string = sb.toString();
        return z ? new String(string.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8) : string;
    }

    private static String unquote(String str) {
        if (!str.startsWith("\"") || !str.endsWith("\"") || str.length() <= 1) {
            return str;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        if (strSubstring.indexOf(92) < 0) {
            return strSubstring;
        }
        StringBuilder sb = new StringBuilder(strSubstring.length());
        int i = 0;
        while (i < strSubstring.length()) {
            char cCharAt = strSubstring.charAt(i);
            if (cCharAt == '\\' && i < strSubstring.length() - 1) {
                i++;
                cCharAt = strSubstring.charAt(i);
            }
            sb.append(cCharAt);
            i++;
        }
        return sb.toString();
    }

    public Object clone() {
        try {
            return (InternetAddress) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // javax.mail.Address
    public boolean equals(Object obj) {
        if (!(obj instanceof InternetAddress)) {
            return false;
        }
        String address = ((InternetAddress) obj).getAddress();
        String str = this.address;
        if (address == str) {
            return true;
        }
        return str != null && str.equalsIgnoreCase(address);
    }

    public String getAddress() {
        return this.address;
    }

    public InternetAddress[] getGroup(boolean z) throws AddressException {
        int iIndexOf;
        String address = getAddress();
        if (address != null && address.endsWith(";") && (iIndexOf = address.indexOf(58)) >= 0) {
            return parseHeader(address.substring(iIndexOf + 1, address.length() - 1), z);
        }
        return null;
    }

    public String getPersonal() {
        String str = this.personal;
        if (str != null) {
            return str;
        }
        String str2 = this.encodedPersonal;
        if (str2 == null) {
            return null;
        }
        try {
            String strDecodeText = MimeUtility.decodeText(str2);
            this.personal = strDecodeText;
            return strDecodeText;
        } catch (Exception unused) {
            return this.encodedPersonal;
        }
    }

    @Override // javax.mail.Address
    public String getType() {
        return "rfc822";
    }

    public int hashCode() {
        String str = this.address;
        if (str == null) {
            return 0;
        }
        return str.toLowerCase(Locale.ENGLISH).hashCode();
    }

    public boolean isGroup() {
        String str = this.address;
        return str != null && str.endsWith(";") && this.address.indexOf(58) > 0;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setPersonal(String str) throws UnsupportedEncodingException {
        this.personal = str;
        this.encodedPersonal = str != null ? MimeUtility.encodeWord(str) : null;
    }

    public void setPersonal(String str, String str2) throws UnsupportedEncodingException {
        this.personal = str;
        if (str != null) {
            this.encodedPersonal = MimeUtility.encodeWord(str, str2, null);
        } else {
            this.encodedPersonal = null;
        }
    }

    @Override // javax.mail.Address
    public String toString() {
        StringBuilder sb;
        String str;
        String str2 = this.address;
        if (str2 == null) {
            str2 = "";
        }
        if (this.encodedPersonal == null && (str = this.personal) != null) {
            try {
                this.encodedPersonal = MimeUtility.encodeWord(str);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        if (this.encodedPersonal != null) {
            sb = new StringBuilder();
            sb.append(quotePhrase(this.encodedPersonal));
            sb.append(" <");
        } else {
            if (isGroup() || isSimple()) {
                return str2;
            }
            sb = new StringBuilder("<");
        }
        sb.append(str2);
        sb.append(">");
        return sb.toString();
    }

    public String toUnicodeString() {
        String personal = getPersonal();
        if (personal != null) {
            return quotePhrase(personal) + " <" + this.address + ">";
        }
        if (isGroup() || isSimple()) {
            return this.address;
        }
        return "<" + this.address + ">";
    }

    public void validate() throws AddressException {
        if (isGroup()) {
            getGroup(true);
        } else {
            checkAddress(getAddress(), true, true);
        }
    }
}
