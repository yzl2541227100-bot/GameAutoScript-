package com.sun.mail.imap.protocol;

import java.util.List;
import javax.mail.Flags;

/* JADX INFO: loaded from: classes2.dex */
public class MailboxInfo {
    public Flags availableFlags;
    public int first;
    public long highestmodseq;
    public int mode;
    public Flags permanentFlags;
    public int recent;
    public List<IMAPResponse> responses;
    public int total;
    public boolean uidNotSticky;
    public long uidnext;
    public long uidvalidity;

    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MailboxInfo(com.sun.mail.iap.Response[] r8) throws com.sun.mail.iap.ParsingException {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.protocol.MailboxInfo.<init>(com.sun.mail.iap.Response[]):void");
    }
}
