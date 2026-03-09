package com.sun.mail.imap.protocol;

import javax.mail.Flags;

/* JADX INFO: loaded from: classes2.dex */
public class FLAGS extends Flags implements Item {
    public static final char[] name = {'F', 'L', 'A', 'G', 'S'};
    private static final long serialVersionUID = 439049847053756670L;
    public int msgno;

    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FLAGS(com.sun.mail.imap.protocol.IMAPResponse r8) throws com.sun.mail.iap.ParsingException {
        /*
            r7 = this;
            r7.<init>()
            int r0 = r8.getNumber()
            r7.msgno = r0
            r8.skipSpaces()
            java.lang.String[] r8 = r8.readSimpleList()
            if (r8 == 0) goto L82
            r0 = 0
            r1 = 0
        L14:
            int r2 = r8.length
            if (r1 >= r2) goto L82
            r2 = r8[r1]
            int r3 = r2.length()
            r4 = 2
            if (r3 < r4) goto L7c
            char r3 = r2.charAt(r0)
            r5 = 92
            if (r3 != r5) goto L7c
            r3 = 1
            char r3 = r2.charAt(r3)
            char r3 = java.lang.Character.toUpperCase(r3)
            r5 = 42
            if (r3 == r5) goto L76
            r5 = 65
            if (r3 == r5) goto L73
            r5 = 68
            r6 = 82
            if (r3 == r5) goto L53
            r4 = 70
            if (r3 == r4) goto L50
            if (r3 == r6) goto L4d
            r4 = 83
            if (r3 == r4) goto L4a
            goto L7c
        L4a:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.SEEN
            goto L78
        L4d:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.RECENT
            goto L78
        L50:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.FLAGGED
            goto L78
        L53:
            int r3 = r2.length()
            r5 = 3
            if (r3 < r5) goto L7c
            char r2 = r2.charAt(r4)
            r3 = 101(0x65, float:1.42E-43)
            if (r2 == r3) goto L70
            r3 = 69
            if (r2 != r3) goto L67
            goto L70
        L67:
            r3 = 114(0x72, float:1.6E-43)
            if (r2 == r3) goto L6d
            if (r2 != r6) goto L7f
        L6d:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.DRAFT
            goto L78
        L70:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.DELETED
            goto L78
        L73:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.ANSWERED
            goto L78
        L76:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.USER
        L78:
            r7.add(r2)
            goto L7f
        L7c:
            r7.add(r2)
        L7f:
            int r1 = r1 + 1
            goto L14
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.protocol.FLAGS.<init>(com.sun.mail.imap.protocol.IMAPResponse):void");
    }
}
