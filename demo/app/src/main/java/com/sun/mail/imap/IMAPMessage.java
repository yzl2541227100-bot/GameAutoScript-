package com.sun.mail.imap;

import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.Utility;
import com.sun.mail.imap.protocol.BODY;
import com.sun.mail.imap.protocol.BODYSTRUCTURE;
import com.sun.mail.imap.protocol.ENVELOPE;
import com.sun.mail.imap.protocol.FetchItem;
import com.sun.mail.imap.protocol.FetchResponse;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.imap.protocol.INTERNALDATE;
import com.sun.mail.imap.protocol.Item;
import com.sun.mail.imap.protocol.MODSEQ;
import com.sun.mail.imap.protocol.RFC822DATA;
import com.sun.mail.imap.protocol.RFC822SIZE;
import com.sun.mail.imap.protocol.UID;
import com.sun.mail.util.ReadableMime;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.IllegalWriteException;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.UIDFolder;
import javax.mail.internet.ContentType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import javax.mail.internet.ParameterList;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes2.dex */
public class IMAPMessage extends MimeMessage implements ReadableMime {
    public static final String EnvelopeCmd = "ENVELOPE INTERNALDATE RFC822.SIZE";
    private volatile boolean bodyLoaded;

    /* JADX INFO: renamed from: bs */
    public BODYSTRUCTURE f18022bs;
    private String description;
    public ENVELOPE envelope;
    private volatile boolean headersLoaded;
    public Map<String, Object> items;
    private Hashtable<String, String> loadedHeaders;
    private volatile long modseq;
    private Boolean peek;
    private Date receivedDate;
    public String sectionId;
    private long size;
    private String subject;
    private String type;
    private volatile long uid;

    public static class FetchProfileCondition implements Utility.Condition {
        private String[] hdrs;
        private Set<FetchItem> need = new HashSet();
        private boolean needBodyStructure;
        private boolean needEnvelope;
        private boolean needFlags;
        private boolean needHeaders;
        private boolean needMessage;
        private boolean needRDate;
        private boolean needSize;
        private boolean needUID;

        public FetchProfileCondition(FetchProfile fetchProfile, FetchItem[] fetchItemArr) {
            this.needEnvelope = false;
            this.needFlags = false;
            this.needBodyStructure = false;
            this.needUID = false;
            this.needHeaders = false;
            this.needSize = false;
            this.needMessage = false;
            this.needRDate = false;
            this.hdrs = null;
            if (fetchProfile.contains(FetchProfile.Item.ENVELOPE)) {
                this.needEnvelope = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.FLAGS)) {
                this.needFlags = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.CONTENT_INFO)) {
                this.needBodyStructure = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.SIZE)) {
                this.needSize = true;
            }
            if (fetchProfile.contains(UIDFolder.FetchProfileItem.UID)) {
                this.needUID = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.HEADERS)) {
                this.needHeaders = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.SIZE)) {
                this.needSize = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.MESSAGE)) {
                this.needMessage = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.INTERNALDATE)) {
                this.needRDate = true;
            }
            this.hdrs = fetchProfile.getHeaderNames();
            for (int i = 0; i < fetchItemArr.length; i++) {
                if (fetchProfile.contains(fetchItemArr[i].getFetchProfileItem())) {
                    this.need.add(fetchItemArr[i]);
                }
            }
        }

        @Override // com.sun.mail.imap.Utility.Condition
        public boolean test(IMAPMessage iMAPMessage) {
            if (this.needEnvelope && iMAPMessage._getEnvelope() == null && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needFlags && iMAPMessage._getFlags() == null) {
                return true;
            }
            if (this.needBodyStructure && iMAPMessage._getBodyStructure() == null && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needUID && iMAPMessage.getUID() == -1) {
                return true;
            }
            if (this.needHeaders && !iMAPMessage.areHeadersLoaded()) {
                return true;
            }
            if (this.needSize && iMAPMessage.size == -1 && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needMessage && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needRDate && iMAPMessage.receivedDate == null) {
                return true;
            }
            int i = 0;
            while (true) {
                String[] strArr = this.hdrs;
                if (i >= strArr.length) {
                    for (FetchItem fetchItem : this.need) {
                        Map<String, Object> map = iMAPMessage.items;
                        if (map == null || map.get(fetchItem.getName()) == null) {
                            return true;
                        }
                    }
                    return false;
                }
                if (!iMAPMessage.isHeaderLoaded(strArr[i])) {
                    return true;
                }
                i++;
            }
        }
    }

    public IMAPMessage(IMAPFolder iMAPFolder, int i) {
        super(iMAPFolder, i);
        this.size = -1L;
        this.uid = -1L;
        this.modseq = -1L;
        this.headersLoaded = false;
        this.bodyLoaded = false;
        this.loadedHeaders = new Hashtable<>(1);
        this.flags = null;
    }

    public IMAPMessage(Session session) {
        super(session);
        this.size = -1L;
        this.uid = -1L;
        this.modseq = -1L;
        this.headersLoaded = false;
        this.bodyLoaded = false;
        this.loadedHeaders = new Hashtable<>(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BODYSTRUCTURE _getBodyStructure() {
        return this.f18022bs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ENVELOPE _getEnvelope() {
        return this.envelope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Flags _getFlags() {
        return this.flags;
    }

    private InternetAddress[] aaclone(InternetAddress[] internetAddressArr) {
        if (internetAddressArr == null) {
            return null;
        }
        return (InternetAddress[]) internetAddressArr.clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean areHeadersLoaded() {
        return this.headersLoaded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHeaderLoaded(String str) {
        if (this.headersLoaded) {
            return true;
        }
        return this.loadedHeaders.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    private synchronized void loadBODYSTRUCTURE() throws MessagingException {
        if (this.f18022bs != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    BODYSTRUCTURE bodystructureFetchBodyStructure = protocol.fetchBodyStructure(getSequenceNumber());
                    this.f18022bs = bodystructureFetchBodyStructure;
                    if (bodystructureFetchBodyStructure == null) {
                        forceCheckExpunged();
                        throw new MessagingException("Unable to load BODYSTRUCTURE");
                    }
                } catch (ConnectionException e) {
                    throw new FolderClosedException(this.folder, e.getMessage());
                } catch (ProtocolException e2) {
                    forceCheckExpunged();
                    throw new MessagingException(e2.getMessage(), e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void loadEnvelope() throws MessagingException {
        if (this.envelope != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                int sequenceNumber = getSequenceNumber();
                Response[] responseArrFetch = protocol.fetch(sequenceNumber, EnvelopeCmd);
                for (int i = 0; i < responseArrFetch.length; i++) {
                    if (responseArrFetch[i] != null && (responseArrFetch[i] instanceof FetchResponse) && ((FetchResponse) responseArrFetch[i]).getNumber() == sequenceNumber) {
                        FetchResponse fetchResponse = (FetchResponse) responseArrFetch[i];
                        int itemCount = fetchResponse.getItemCount();
                        for (int i2 = 0; i2 < itemCount; i2++) {
                            Item item = fetchResponse.getItem(i2);
                            if (item instanceof ENVELOPE) {
                                this.envelope = (ENVELOPE) item;
                            } else if (item instanceof INTERNALDATE) {
                                this.receivedDate = ((INTERNALDATE) item).getDate();
                            } else if (item instanceof RFC822SIZE) {
                                this.size = ((RFC822SIZE) item).size;
                            }
                        }
                    }
                }
                protocol.notifyResponseHandlers(responseArrFetch);
                protocol.handleResult(responseArrFetch[responseArrFetch.length - 1]);
            } catch (ConnectionException e) {
                throw new FolderClosedException(this.folder, e.getMessage());
            } catch (ProtocolException e2) {
                forceCheckExpunged();
                throw new MessagingException(e2.getMessage(), e2);
            }
        }
        if (this.envelope == null) {
            throw new MessagingException("Failed to load IMAP envelope");
        }
    }

    private synchronized void loadFlags() throws MessagingException {
        if (this.flags != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                Flags flagsFetchFlags = protocol.fetchFlags(getSequenceNumber());
                this.flags = flagsFetchFlags;
                if (flagsFetchFlags == null) {
                    this.flags = new Flags();
                }
            } catch (ConnectionException e) {
                throw new FolderClosedException(this.folder, e.getMessage());
            } catch (ProtocolException e2) {
                forceCheckExpunged();
                throw new MessagingException(e2.getMessage(), e2);
            }
        }
    }

    private synchronized void loadHeaders() throws MessagingException {
        if (this.headersLoaded) {
            return;
        }
        ByteArrayInputStream byteArrayInputStream = null;
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                if (protocol.isREV1()) {
                    BODY bodyPeekBody = protocol.peekBody(getSequenceNumber(), toSection("HEADER"));
                    if (bodyPeekBody != null) {
                        byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                    }
                } else {
                    RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), "HEADER");
                    if (rfc822dataFetchRFC822 != null) {
                        byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                    }
                }
            } catch (ConnectionException e) {
                throw new FolderClosedException(this.folder, e.getMessage());
            } catch (ProtocolException e2) {
                forceCheckExpunged();
                throw new MessagingException(e2.getMessage(), e2);
            }
        }
        if (byteArrayInputStream == null) {
            throw new MessagingException("Cannot load header");
        }
        this.headers = new InternetHeaders(byteArrayInputStream);
        this.headersLoaded = true;
    }

    private void setHeaderLoaded(String str) {
        this.loadedHeaders.put(str.toUpperCase(Locale.ENGLISH), str);
    }

    private void setHeadersLoaded(boolean z) {
        this.headersLoaded = z;
    }

    private String toSection(String str) {
        if (this.sectionId == null) {
            return str;
        }
        return this.sectionId + "." + str;
    }

    public long _getModSeq() {
        return this.modseq;
    }

    public Session _getSession() {
        return this.session;
    }

    public void _setFlags(Flags flags) {
        this.flags = flags;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void addFrom(Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void addHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public void addHeaderLine(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void addRecipients(Message.RecipientType recipientType, Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void checkExpunged() throws MessageRemovedException {
        if (this.expunged) {
            throw new MessageRemovedException();
        }
    }

    public Object fetchItem(FetchItem fetchItem) throws MessagingException {
        Object obj;
        Object obj2;
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    int sequenceNumber = getSequenceNumber();
                    Response[] responseArrFetch = protocol.fetch(sequenceNumber, fetchItem.getName());
                    obj = null;
                    for (int i = 0; i < responseArrFetch.length; i++) {
                        if (responseArrFetch[i] != null && (responseArrFetch[i] instanceof FetchResponse) && ((FetchResponse) responseArrFetch[i]).getNumber() == sequenceNumber) {
                            handleExtensionFetchItems(((FetchResponse) responseArrFetch[i]).getExtensionItems());
                            Map<String, Object> map = this.items;
                            if (map != null && (obj2 = map.get(fetchItem.getName())) != null) {
                                obj = obj2;
                            }
                        }
                    }
                    protocol.notifyResponseHandlers(responseArrFetch);
                    protocol.handleResult(responseArrFetch[responseArrFetch.length - 1]);
                } catch (ConnectionException e) {
                    throw new FolderClosedException(this.folder, e.getMessage());
                } catch (ProtocolException e2) {
                    forceCheckExpunged();
                    throw new MessagingException(e2.getMessage(), e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void forceCheckExpunged() throws FolderClosedException, MessageRemovedException {
        synchronized (getMessageCacheLock()) {
            try {
                getProtocol().noop();
            } catch (ConnectionException e) {
                throw new FolderClosedException(this.folder, e.getMessage());
            } catch (ProtocolException unused) {
            }
        }
        if (this.expunged) {
            throw new MessageRemovedException();
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getAllHeaderLines() throws MessagingException {
        checkExpunged();
        loadHeaders();
        return super.getAllHeaderLines();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getAllHeaders() throws MessagingException {
        checkExpunged();
        loadHeaders();
        return super.getAllHeaders();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getContentID() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentID();
        }
        loadBODYSTRUCTURE();
        return this.f18022bs.f18026id;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String[] getContentLanguage() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentLanguage();
        }
        loadBODYSTRUCTURE();
        String[] strArr = this.f18022bs.language;
        if (strArr != null) {
            return (String[]) strArr.clone();
        }
        return null;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getContentMD5() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentMD5();
        }
        loadBODYSTRUCTURE();
        return this.f18022bs.md5;
    }

    @Override // javax.mail.internet.MimeMessage
    public InputStream getContentStream() throws MessagingException {
        if (this.bodyLoaded) {
            return super.getContentStream();
        }
        ByteArrayInputStream byteArrayInputStream = null;
        boolean peek = getPeek();
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                if (protocol.isREV1()) {
                    int i = -1;
                    if (getFetchBlockSize() != -1) {
                        String section = toSection("TEXT");
                        if (this.f18022bs != null && !ignoreBodyStructureSize()) {
                            i = this.f18022bs.size;
                        }
                        return new IMAPInputStream(this, section, i, peek);
                    }
                }
                if (protocol.isREV1()) {
                    BODY bodyPeekBody = peek ? protocol.peekBody(getSequenceNumber(), toSection("TEXT")) : protocol.fetchBody(getSequenceNumber(), toSection("TEXT"));
                    if (bodyPeekBody != null) {
                        byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                    }
                } else {
                    RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), "TEXT");
                    if (rfc822dataFetchRFC822 != null) {
                        byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                    }
                }
                if (byteArrayInputStream != null) {
                    return byteArrayInputStream;
                }
                forceCheckExpunged();
                return new ByteArrayInputStream(new byte[0]);
            } catch (ConnectionException e) {
                throw new FolderClosedException(this.folder, e.getMessage());
            } catch (ProtocolException e2) {
                forceCheckExpunged();
                throw new MessagingException(e2.getMessage(), e2);
            }
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public synchronized String getContentType() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentType();
        }
        if (this.type == null) {
            loadBODYSTRUCTURE();
            BODYSTRUCTURE bodystructure = this.f18022bs;
            this.type = new ContentType(bodystructure.type, bodystructure.subtype, bodystructure.cParams).toString();
        }
        return this.type;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public synchronized DataHandler getDataHandler() throws MessagingException {
        DataHandler dataHandler;
        String str;
        checkExpunged();
        if (this.f19531dh == null && !this.bodyLoaded) {
            loadBODYSTRUCTURE();
            if (this.type == null) {
                BODYSTRUCTURE bodystructure = this.f18022bs;
                this.type = new ContentType(bodystructure.type, bodystructure.subtype, bodystructure.cParams).toString();
            }
            if (this.f18022bs.isMulti()) {
                dataHandler = new DataHandler(new IMAPMultipartDataSource(this, this.f18022bs.bodies, this.sectionId, this));
            } else if (this.f18022bs.isNested() && isREV1() && this.f18022bs.envelope != null) {
                BODYSTRUCTURE bodystructure2 = this.f18022bs;
                BODYSTRUCTURE bodystructure3 = bodystructure2.bodies[0];
                ENVELOPE envelope = bodystructure2.envelope;
                if (this.sectionId == null) {
                    str = "1";
                } else {
                    str = this.sectionId + ".1";
                }
                dataHandler = new DataHandler(new IMAPNestedMessage(this, bodystructure3, envelope, str), this.type);
            }
            this.f19531dh = dataHandler;
        }
        return super.getDataHandler();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String getDescription() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getDescription();
        }
        String str = this.description;
        if (str != null) {
            return str;
        }
        loadBODYSTRUCTURE();
        String str2 = this.f18022bs.description;
        if (str2 == null) {
            return null;
        }
        try {
            this.description = MimeUtility.decodeText(str2);
        } catch (UnsupportedEncodingException unused) {
            this.description = this.f18022bs.description;
        }
        return this.description;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String getDisposition() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getDisposition();
        }
        loadBODYSTRUCTURE();
        return this.f18022bs.disposition;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getEncoding() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getEncoding();
        }
        loadBODYSTRUCTURE();
        return this.f18022bs.encoding;
    }

    public int getFetchBlockSize() {
        return ((IMAPStore) this.folder.getStore()).getFetchBlockSize();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String getFileName() throws MessagingException {
        ParameterList parameterList;
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getFileName();
        }
        loadBODYSTRUCTURE();
        ParameterList parameterList2 = this.f18022bs.dParams;
        String str = parameterList2 != null ? parameterList2.get("filename") : null;
        return (str != null || (parameterList = this.f18022bs.cParams) == null) ? str : parameterList.get("name");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public synchronized Flags getFlags() throws MessagingException {
        checkExpunged();
        loadFlags();
        return super.getFlags();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Address[] getFrom() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getFrom();
        }
        loadEnvelope();
        ENVELOPE envelope = this.envelope;
        InternetAddress[] internetAddressArr = envelope.from;
        if (internetAddressArr == null || internetAddressArr.length == 0) {
            internetAddressArr = envelope.sender;
        }
        return aaclone(internetAddressArr);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getHeader(String str, String str2) throws MessagingException {
        checkExpunged();
        if (getHeader(str) == null) {
            return null;
        }
        return this.headers.getHeader(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String[] getHeader(java.lang.String r7) throws javax.mail.MessagingException {
        /*
            r6 = this;
            r6.checkExpunged()
            boolean r0 = r6.isHeaderLoaded(r7)
            if (r0 == 0) goto L10
        L9:
            javax.mail.internet.InternetHeaders r0 = r6.headers
            java.lang.String[] r7 = r0.getHeader(r7)
            return r7
        L10:
            java.lang.Object r0 = r6.getMessageCacheLock()
            monitor-enter(r0)
            com.sun.mail.imap.protocol.IMAPProtocol r1 = r6.getProtocol()     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            r6.checkExpunged()     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            boolean r2 = r1.isREV1()     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            r3 = 0
            if (r2 == 0) goto L4b
            int r2 = r6.getSequenceNumber()     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            java.lang.String r5 = "HEADER.FIELDS ("
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            r4.append(r7)     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            java.lang.String r4 = r6.toSection(r4)     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            com.sun.mail.imap.protocol.BODY r1 = r1.peekBody(r2, r4)     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            if (r1 == 0) goto L49
            java.io.ByteArrayInputStream r1 = r1.getByteArrayInputStream()     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            goto L6c
        L49:
            r1 = r3
            goto L6c
        L4b:
            int r2 = r6.getSequenceNumber()     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            java.lang.String r5 = "HEADER.LINES ("
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            r4.append(r7)     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            com.sun.mail.imap.protocol.RFC822DATA r1 = r1.fetchRFC822(r2, r4)     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
            if (r1 == 0) goto L49
            java.io.ByteArrayInputStream r1 = r1.getByteArrayInputStream()     // Catch: java.lang.Throwable -> L84 com.sun.mail.iap.ProtocolException -> L86 com.sun.mail.iap.ConnectionException -> L94
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            if (r1 != 0) goto L70
            return r3
        L70:
            javax.mail.internet.InternetHeaders r0 = r6.headers
            if (r0 != 0) goto L7b
            javax.mail.internet.InternetHeaders r0 = new javax.mail.internet.InternetHeaders
            r0.<init>()
            r6.headers = r0
        L7b:
            javax.mail.internet.InternetHeaders r0 = r6.headers
            r0.load(r1)
            r6.setHeaderLoaded(r7)
            goto L9
        L84:
            r7 = move-exception
            goto La1
        L86:
            r7 = move-exception
            r6.forceCheckExpunged()     // Catch: java.lang.Throwable -> L84
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = r7.getMessage()     // Catch: java.lang.Throwable -> L84
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L94:
            r7 = move-exception
            javax.mail.FolderClosedException r1 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L84
            javax.mail.Folder r2 = r6.folder     // Catch: java.lang.Throwable -> L84
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L84
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        La1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.IMAPMessage.getHeader(java.lang.String):java.lang.String[]");
    }

    public String getInReplyTo() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getHeader("In-Reply-To", C4196o4.OooO00o.OooO0Oo);
        }
        loadEnvelope();
        return this.envelope.inReplyTo;
    }

    public synchronized Object getItem(FetchItem fetchItem) throws MessagingException {
        Object objFetchItem;
        Map<String, Object> map = this.items;
        objFetchItem = map == null ? null : map.get(fetchItem.getName());
        if (objFetchItem == null) {
            objFetchItem = fetchItem(fetchItem);
        }
        return objFetchItem;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public int getLineCount() throws MessagingException {
        checkExpunged();
        loadBODYSTRUCTURE();
        return this.f18022bs.lines;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getMatchingHeaderLines(String[] strArr) throws MessagingException {
        checkExpunged();
        loadHeaders();
        return super.getMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getMatchingHeaders(String[] strArr) throws MessagingException {
        checkExpunged();
        loadHeaders();
        return super.getMatchingHeaders(strArr);
    }

    public Object getMessageCacheLock() {
        return ((IMAPFolder) this.folder).messageCacheLock;
    }

    @Override // javax.mail.internet.MimeMessage
    public String getMessageID() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getMessageID();
        }
        loadEnvelope();
        return this.envelope.messageId;
    }

    @Override // com.sun.mail.util.ReadableMime
    public InputStream getMimeStream() throws MessagingException {
        boolean peek = getPeek();
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                if (protocol.isREV1() && getFetchBlockSize() != -1) {
                    return new IMAPInputStream(this, this.sectionId, -1, peek);
                }
                ByteArrayInputStream byteArrayInputStream = null;
                if (protocol.isREV1()) {
                    BODY bodyPeekBody = peek ? protocol.peekBody(getSequenceNumber(), this.sectionId) : protocol.fetchBody(getSequenceNumber(), this.sectionId);
                    if (bodyPeekBody != null) {
                        byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                    }
                } else {
                    RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), null);
                    if (rfc822dataFetchRFC822 != null) {
                        byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                    }
                }
                if (byteArrayInputStream != null) {
                    return byteArrayInputStream;
                }
                forceCheckExpunged();
                return new ByteArrayInputStream(new byte[0]);
            } catch (ConnectionException e) {
                throw new FolderClosedException(this.folder, e.getMessage());
            } catch (ProtocolException e2) {
                forceCheckExpunged();
                throw new MessagingException(e2.getMessage(), e2);
            }
        }
    }

    public synchronized long getModSeq() throws MessagingException {
        if (this.modseq != -1) {
            return this.modseq;
        }
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                MODSEQ modseqFetchMODSEQ = protocol.fetchMODSEQ(getSequenceNumber());
                if (modseqFetchMODSEQ != null) {
                    this.modseq = modseqFetchMODSEQ.modseq;
                }
            } catch (ConnectionException e) {
                throw new FolderClosedException(this.folder, e.getMessage());
            } catch (ProtocolException e2) {
                throw new MessagingException(e2.getMessage(), e2);
            }
        }
        return this.modseq;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws MessagingException {
        checkExpunged();
        loadHeaders();
        return super.getNonMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) throws MessagingException {
        checkExpunged();
        loadHeaders();
        return super.getNonMatchingHeaders(strArr);
    }

    public synchronized boolean getPeek() {
        Boolean bool = this.peek;
        if (bool == null) {
            return ((IMAPStore) this.folder.getStore()).getPeek();
        }
        return bool.booleanValue();
    }

    public IMAPProtocol getProtocol() throws ProtocolException, FolderClosedException {
        ((IMAPFolder) this.folder).waitIfIdle();
        IMAPProtocol iMAPProtocol = ((IMAPFolder) this.folder).protocol;
        if (iMAPProtocol != null) {
            return iMAPProtocol;
        }
        throw new FolderClosedException(this.folder);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Date getReceivedDate() throws MessagingException {
        checkExpunged();
        if (this.receivedDate == null) {
            loadEnvelope();
        }
        if (this.receivedDate == null) {
            return null;
        }
        return new Date(this.receivedDate.getTime());
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Address[] getRecipients(Message.RecipientType recipientType) throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getRecipients(recipientType);
        }
        loadEnvelope();
        return recipientType == Message.RecipientType.f19526TO ? aaclone(this.envelope.f18028to) : recipientType == Message.RecipientType.f19525CC ? aaclone(this.envelope.f18027cc) : recipientType == Message.RecipientType.BCC ? aaclone(this.envelope.bcc) : super.getRecipients(recipientType);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Address[] getReplyTo() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getReplyTo();
        }
        loadEnvelope();
        InternetAddress[] internetAddressArr = this.envelope.replyTo;
        return (internetAddressArr == null || internetAddressArr.length == 0) ? getFrom() : aaclone(internetAddressArr);
    }

    @Override // javax.mail.internet.MimeMessage
    public Address getSender() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getSender();
        }
        loadEnvelope();
        InternetAddress[] internetAddressArr = this.envelope.sender;
        if (internetAddressArr == null || internetAddressArr.length <= 0) {
            return null;
        }
        return internetAddressArr[0];
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Date getSentDate() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getSentDate();
        }
        loadEnvelope();
        if (this.envelope.date == null) {
            return null;
        }
        return new Date(this.envelope.date.getTime());
    }

    public int getSequenceNumber() {
        return ((IMAPFolder) this.folder).messageCache.seqnumOf(getMessageNumber());
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public int getSize() throws MessagingException {
        checkExpunged();
        if (this.size == -1) {
            loadEnvelope();
        }
        long j = this.size;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public long getSizeLong() throws MessagingException {
        checkExpunged();
        if (this.size == -1) {
            loadEnvelope();
        }
        return this.size;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public String getSubject() throws MessagingException {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getSubject();
        }
        String str = this.subject;
        if (str != null) {
            return str;
        }
        loadEnvelope();
        String str2 = this.envelope.subject;
        if (str2 == null) {
            return null;
        }
        try {
            this.subject = MimeUtility.decodeText(MimeUtility.unfold(str2));
        } catch (UnsupportedEncodingException unused) {
            this.subject = this.envelope.subject;
        }
        return this.subject;
    }

    public long getUID() {
        return this.uid;
    }

    public void handleExtensionFetchItems(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.items == null) {
            this.items = new HashMap();
        }
        this.items.putAll(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleFetchItem(Item item, String[] strArr, boolean z) throws MessagingException {
        ByteArrayInputStream byteArrayInputStream;
        boolean zIsHeader;
        if (item instanceof Flags) {
            this.flags = (Flags) item;
        } else if (item instanceof ENVELOPE) {
            this.envelope = (ENVELOPE) item;
        } else if (item instanceof INTERNALDATE) {
            this.receivedDate = ((INTERNALDATE) item).getDate();
        } else if (item instanceof RFC822SIZE) {
            this.size = ((RFC822SIZE) item).size;
        } else if (item instanceof MODSEQ) {
            this.modseq = ((MODSEQ) item).modseq;
        } else if (item instanceof BODYSTRUCTURE) {
            this.f18022bs = (BODYSTRUCTURE) item;
        } else if (item instanceof UID) {
            UID uid = (UID) item;
            this.uid = uid.uid;
            Folder folder = this.folder;
            if (((IMAPFolder) folder).uidTable == null) {
                ((IMAPFolder) folder).uidTable = new Hashtable<>();
            }
            ((IMAPFolder) this.folder).uidTable.put(Long.valueOf(uid.uid), this);
        } else {
            boolean z3 = item instanceof RFC822DATA;
            if (!z3 && !(item instanceof BODY)) {
                return false;
            }
            if (z3) {
                RFC822DATA rfc822data = (RFC822DATA) item;
                byteArrayInputStream = rfc822data.getByteArrayInputStream();
                zIsHeader = rfc822data.isHeader();
            } else {
                BODY body = (BODY) item;
                byteArrayInputStream = body.getByteArrayInputStream();
                zIsHeader = body.isHeader();
            }
            if (zIsHeader) {
                InternetHeaders internetHeaders = new InternetHeaders();
                if (byteArrayInputStream != null) {
                    internetHeaders.load(byteArrayInputStream);
                }
                if (this.headers == null || z) {
                    this.headers = internetHeaders;
                } else {
                    Enumeration<Header> allHeaders = internetHeaders.getAllHeaders();
                    while (allHeaders.hasMoreElements()) {
                        Header headerNextElement = allHeaders.nextElement();
                        if (!isHeaderLoaded(headerNextElement.getName())) {
                            this.headers.addHeader(headerNextElement.getName(), headerNextElement.getValue());
                        }
                    }
                }
                if (!z) {
                    for (String str : strArr) {
                        setHeaderLoaded(str);
                    }
                }
            } else {
                try {
                    this.size = byteArrayInputStream.available();
                } catch (IOException unused) {
                }
                parse(byteArrayInputStream);
                this.bodyLoaded = true;
            }
            setHeadersLoaded(true);
        }
        return true;
    }

    public boolean ignoreBodyStructureSize() {
        return ((IMAPStore) this.folder.getStore()).ignoreBodyStructureSize();
    }

    public synchronized void invalidateHeaders() {
        this.headersLoaded = false;
        this.loadedHeaders.clear();
        this.headers = null;
        this.envelope = null;
        this.f18022bs = null;
        this.receivedDate = null;
        this.size = -1L;
        this.type = null;
        this.subject = null;
        this.description = null;
        this.flags = null;
        this.content = null;
        this.contentStream = null;
        this.bodyLoaded = false;
    }

    public boolean isREV1() throws FolderClosedException {
        IMAPProtocol iMAPProtocol = ((IMAPFolder) this.folder).protocol;
        if (iMAPProtocol != null) {
            return iMAPProtocol.isREV1();
        }
        throw new FolderClosedException(this.folder);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public synchronized boolean isSet(Flags.Flag flag) throws MessagingException {
        checkExpunged();
        loadFlags();
        return super.isSet(flag);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void removeHeader(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setContentID(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public void setContentLanguage(String[] strArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public void setContentMD5(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setDataHandler(DataHandler dataHandler) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setDescription(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setDisposition(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.Message
    public void setExpunged(boolean z) {
        super.setExpunged(z);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setFileName(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public synchronized void setFlags(Flags flags, boolean z) throws MessagingException {
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                protocol.storeFlags(getSequenceNumber(), flags, z);
            } catch (ConnectionException e) {
                throw new FolderClosedException(this.folder, e.getMessage());
            } catch (ProtocolException e2) {
                throw new MessagingException(e2.getMessage(), e2);
            }
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setFrom(Address address) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.Message
    public void setMessageNumber(int i) {
        super.setMessageNumber(i);
    }

    public void setModSeq(long j) {
        this.modseq = j;
    }

    public synchronized void setPeek(boolean z) {
        this.peek = Boolean.valueOf(z);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setRecipients(Message.RecipientType recipientType, Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setReplyTo(Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setSender(Address address) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setSentDate(Date date) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setSubject(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setUID(long j) {
        this.uid = j;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void writeTo(OutputStream outputStream) throws MessagingException, IOException {
        if (this.bodyLoaded) {
            super.writeTo(outputStream);
            return;
        }
        InputStream mimeStream = getMimeStream();
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = mimeStream.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i);
                }
            }
        } finally {
            mimeStream.close();
        }
    }
}
