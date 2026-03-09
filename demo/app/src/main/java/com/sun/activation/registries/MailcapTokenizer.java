package com.sun.activation.registries;

import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes2.dex */
public class MailcapTokenizer {
    public static final int EOI_TOKEN = 5;
    public static final int EQUALS_TOKEN = 61;
    public static final int SEMICOLON_TOKEN = 59;
    public static final int SLASH_TOKEN = 47;
    public static final int START_TOKEN = 1;
    public static final int STRING_TOKEN = 2;
    public static final int UNKNOWN_TOKEN = 0;
    private String data;
    private int dataLength;
    private int dataIndex = 0;
    private int currentToken = 1;
    private String currentTokenValue = "";
    private boolean isAutoquoting = false;
    private char autoquoteChar = ';';

    public MailcapTokenizer(String str) {
        this.data = str;
        this.dataLength = str.length();
    }

    private static String fixEscapeSequences(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(length);
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\' && i < length - 1) {
                i++;
                cCharAt = str.charAt(i);
            }
            stringBuffer.append(cCharAt);
            i++;
        }
        return stringBuffer.toString();
    }

    private static boolean isControlChar(char c) {
        return Character.isISOControl(c);
    }

    private static boolean isSpecialChar(char c) {
        if (c != '\"' && c != ',' && c != '/' && c != '(' && c != ')') {
            switch (c) {
                default:
                    switch (c) {
                        case '[':
                        case '\\':
                        case ']':
                            break;
                        default:
                            return false;
                    }
                case ':':
                case ';':
                case '<':
                case '=':
                case '>':
                case '?':
                case '@':
                    return true;
            }
        }
        return true;
    }

    private static boolean isStringTokenChar(char c) {
        return (isSpecialChar(c) || isControlChar(c) || isWhiteSpaceChar(c)) ? false : true;
    }

    private static boolean isWhiteSpaceChar(char c) {
        return Character.isWhitespace(c);
    }

    public static String nameForToken(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 5 ? i != 47 ? i != 59 ? i != 61 ? "really unknown" : "'='" : "';'" : "'/'" : "EOI" : C1875i.f11532g : C1781c.f10279bT : "unknown";
    }

    private void processAutoquoteToken() {
        int i;
        int i2 = this.dataIndex;
        boolean z = false;
        while (true) {
            i = this.dataIndex;
            if (i >= this.dataLength || z) {
                break;
            } else if (this.data.charAt(i) != this.autoquoteChar) {
                this.dataIndex++;
            } else {
                z = true;
            }
        }
        this.currentToken = 2;
        this.currentTokenValue = fixEscapeSequences(this.data.substring(i2, i));
    }

    private void processStringToken() {
        int i = this.dataIndex;
        while (true) {
            int i2 = this.dataIndex;
            if (i2 >= this.dataLength || !isStringTokenChar(this.data.charAt(i2))) {
                break;
            } else {
                this.dataIndex++;
            }
        }
        this.currentToken = 2;
        this.currentTokenValue = this.data.substring(i, this.dataIndex);
    }

    public int getCurrentToken() {
        return this.currentToken;
    }

    public String getCurrentTokenValue() {
        return this.currentTokenValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int nextToken() {
        /*
            r4 = this;
            int r0 = r4.dataIndex
            int r1 = r4.dataLength
            r2 = 0
            r3 = 5
            if (r0 >= r1) goto L68
        L8:
            int r0 = r4.dataIndex
            int r1 = r4.dataLength
            if (r0 >= r1) goto L21
            java.lang.String r1 = r4.data
            char r0 = r1.charAt(r0)
            boolean r0 = isWhiteSpaceChar(r0)
            if (r0 == 0) goto L21
            int r0 = r4.dataIndex
            int r0 = r0 + 1
            r4.dataIndex = r0
            goto L8
        L21:
            int r0 = r4.dataIndex
            int r1 = r4.dataLength
            if (r0 >= r1) goto L68
            java.lang.String r1 = r4.data
            char r0 = r1.charAt(r0)
            boolean r1 = r4.isAutoquoting
            r2 = 61
            r3 = 59
            if (r1 == 0) goto L51
            if (r0 == r3) goto L3e
            if (r0 != r2) goto L3a
            goto L3e
        L3a:
            r4.processAutoquoteToken()
            goto L6c
        L3e:
            r4.currentToken = r0
        L40:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.String r0 = r0.toString()
            r4.currentTokenValue = r0
            int r0 = r4.dataIndex
            int r0 = r0 + 1
            r4.dataIndex = r0
            goto L6c
        L51:
            boolean r1 = isStringTokenChar(r0)
            if (r1 == 0) goto L5b
            r4.processStringToken()
            goto L6c
        L5b:
            r1 = 47
            if (r0 == r1) goto L3e
            if (r0 == r3) goto L3e
            if (r0 != r2) goto L64
            goto L3e
        L64:
            r1 = 0
            r4.currentToken = r1
            goto L40
        L68:
            r4.currentToken = r3
            r4.currentTokenValue = r2
        L6c:
            int r0 = r4.currentToken
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.activation.registries.MailcapTokenizer.nextToken():int");
    }

    public void setIsAutoquoting(boolean z) {
        this.isAutoquoting = z;
    }
}
