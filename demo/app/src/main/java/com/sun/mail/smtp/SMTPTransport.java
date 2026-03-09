package com.sun.mail.smtp;

import androidx.fragment.app.FragmentManagerImpl;
import com.lidroid.xutils.http.client.multipart.MIME;
import com.sun.mail.auth.Ntlm;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailConnectException;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketConnectException;
import com.sun.mail.util.SocketFetcher;
import com.sun.mail.util.TraceInputStream;
import com.sun.mail.util.TraceOutputStream;
import com.umeng.commonsdk.proguard.C3442bg;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.mail.Address;
import javax.mail.AuthenticationFailedException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.URLName;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimePart;
import javax.mail.internet.ParseException;
import javax.net.ssl.SSLSocket;
import p285z2.C4032jp;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes2.dex */
public class SMTPTransport extends Transport {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String UNKNOWN = "UNKNOWN";
    private Address[] addresses;
    private boolean allowutf8;
    private Map<String, Authenticator> authenticators;
    private String authorizationID;
    private int chunkSize;
    private SMTPOutputStream dataStream;
    private boolean debugpassword;
    private boolean debugusername;
    private String defaultAuthenticationMechanisms;
    private int defaultPort;
    private boolean enableSASL;
    private MessagingException exception;
    private Hashtable<String, String> extMap;
    private String host;
    private Address[] invalidAddr;
    private boolean isSSL;
    private int lastReturnCode;
    private String lastServerResponse;
    private LineInputStream lineInputStream;
    private String localHostName;
    private MailLogger logger;
    private MimeMessage message;
    private String name;
    private boolean noauthdebug;
    private boolean noopStrict;
    private boolean notificationDone;
    private String ntlmDomain;
    private boolean quitOnSessionReject;
    private boolean quitWait;
    private boolean reportSuccess;
    private boolean requireStartTLS;
    private SaslAuthenticator saslAuthenticator;
    private String[] saslMechanisms;
    private String saslRealm;
    private boolean sendPartiallyFailed;
    private BufferedInputStream serverInput;
    private OutputStream serverOutput;
    private Socket serverSocket;
    private TraceInputStream traceInput;
    private MailLogger traceLogger;
    private TraceOutputStream traceOutput;
    private boolean useCanonicalHostName;
    private boolean useRset;
    private boolean useStartTLS;
    private Address[] validSentAddr;
    private Address[] validUnsentAddr;
    private static final String[] ignoreList = {"Bcc", "Content-Length"};
    private static final byte[] CRLF = {C3442bg.f18781k, 10};
    private static final String[] UNKNOWN_SA = new String[0];
    private static char[] hexchar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public abstract class Authenticator {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean enabled;
        private final String mech;
        public int resp;

        public Authenticator(SMTPTransport sMTPTransport, String str) {
            this(str, true);
        }

        public Authenticator(String str, boolean z) {
            this.mech = str.toUpperCase(Locale.ENGLISH);
            this.enabled = z;
        }

        public boolean authenticate(String str, String str2, String str3, String str4) throws MessagingException {
            String str5;
            int iSimpleCommand;
            int iSimpleCommand2;
            str5 = "succeeded";
            try {
                try {
                    String initialResponse = getInitialResponse(str, str2, str3, str4);
                    if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                        SMTPTransport.this.logger.fine("AUTH " + this.mech + " command trace suppressed");
                        SMTPTransport.this.suspendTracing();
                    }
                    if (initialResponse != null) {
                        SMTPTransport sMTPTransport = SMTPTransport.this;
                        StringBuilder sb = new StringBuilder("AUTH ");
                        sb.append(this.mech);
                        sb.append(C4196o4.OooO00o.OooO0Oo);
                        sb.append(initialResponse.length() == 0 ? "=" : initialResponse);
                        iSimpleCommand = sMTPTransport.simpleCommand(sb.toString());
                    } else {
                        iSimpleCommand = SMTPTransport.this.simpleCommand("AUTH " + this.mech);
                    }
                    this.resp = iSimpleCommand;
                    if (this.resp == 530) {
                        SMTPTransport.this.startTLS();
                        if (initialResponse != null) {
                            iSimpleCommand2 = SMTPTransport.this.simpleCommand("AUTH " + this.mech + C4196o4.OooO00o.OooO0Oo + initialResponse);
                        } else {
                            iSimpleCommand2 = SMTPTransport.this.simpleCommand("AUTH " + this.mech);
                        }
                        this.resp = iSimpleCommand2;
                    }
                    if (this.resp == 334) {
                        doAuth(str, str2, str3, str4);
                    }
                    if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                        MailLogger mailLogger = SMTPTransport.this.logger;
                        StringBuilder sb2 = new StringBuilder("AUTH ");
                        sb2.append(this.mech);
                        sb2.append(C4196o4.OooO00o.OooO0Oo);
                        sb2.append(this.resp != 235 ? "failed" : "succeeded");
                        mailLogger.fine(sb2.toString());
                    }
                    SMTPTransport.this.resumeTracing();
                    if (this.resp == 235) {
                        return true;
                    }
                    SMTPTransport.this.closeConnection();
                    throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse());
                } catch (IOException e) {
                    SMTPTransport.this.logger.log(Level.FINE, "AUTH " + this.mech + " failed", (Throwable) e);
                    if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                        MailLogger mailLogger2 = SMTPTransport.this.logger;
                        StringBuilder sb3 = new StringBuilder("AUTH ");
                        sb3.append(this.mech);
                        sb3.append(C4196o4.OooO00o.OooO0Oo);
                        str5 = this.resp != 235 ? "failed" : "succeeded";
                        sb3.append(str5);
                        mailLogger2.fine(sb3.toString());
                    }
                    SMTPTransport.this.resumeTracing();
                    if (this.resp != 235) {
                        SMTPTransport.this.closeConnection();
                        throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse());
                    }
                    return true;
                } catch (Throwable th) {
                    SMTPTransport.this.logger.log(Level.FINE, "AUTH " + this.mech + " failed", th);
                    if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                        MailLogger mailLogger3 = SMTPTransport.this.logger;
                        StringBuilder sb4 = new StringBuilder("AUTH ");
                        sb4.append(this.mech);
                        sb4.append(C4196o4.OooO00o.OooO0Oo);
                        str5 = this.resp != 235 ? "failed" : "succeeded";
                        sb4.append(str5);
                        mailLogger3.fine(sb4.toString());
                    }
                    SMTPTransport.this.resumeTracing();
                    if (this.resp != 235) {
                        SMTPTransport.this.closeConnection();
                        if (th instanceof Error) {
                            throw ((Error) th);
                        }
                        if (th instanceof Exception) {
                            throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse(), (Exception) th);
                        }
                        throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse());
                    }
                    return true;
                }
            } catch (Throwable th2) {
                if (SMTPTransport.this.noauthdebug && SMTPTransport.this.isTracing()) {
                    MailLogger mailLogger4 = SMTPTransport.this.logger;
                    StringBuilder sb5 = new StringBuilder("AUTH ");
                    sb5.append(this.mech);
                    sb5.append(C4196o4.OooO00o.OooO0Oo);
                    if (this.resp != 235) {
                        str5 = "failed";
                    }
                    sb5.append(str5);
                    mailLogger4.fine(sb5.toString());
                }
                SMTPTransport.this.resumeTracing();
                if (this.resp == 235) {
                    throw th2;
                }
                SMTPTransport.this.closeConnection();
                throw new AuthenticationFailedException(SMTPTransport.this.getLastServerResponse());
            }
        }

        public abstract void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException;

        public boolean enabled() {
            return this.enabled;
        }

        public String getInitialResponse(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            return null;
        }

        public String getMechanism() {
            return this.mech;
        }
    }

    public class BDATOutputStream extends SMTPOutputStream {
        public BDATOutputStream(OutputStream outputStream, int i) {
            super(SMTPTransport.this.new ChunkedOutputStream(outputStream, i));
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            ((FilterOutputStream) this).out.close();
        }
    }

    public class ChunkedOutputStream extends OutputStream {
        private final byte[] buf;
        private int count = 0;
        private final OutputStream out;

        public ChunkedOutputStream(OutputStream outputStream, int i) {
            this.out = outputStream;
            this.buf = new byte[i];
        }

        private void bdat(byte[] bArr, int i, int i2, boolean z) throws IOException {
            SMTPTransport sMTPTransport;
            String strConcat;
            if (i2 > 0 || z) {
                try {
                    if (z) {
                        sMTPTransport = SMTPTransport.this;
                        strConcat = "BDAT " + i2 + " LAST";
                    } else {
                        sMTPTransport = SMTPTransport.this;
                        strConcat = "BDAT ".concat(String.valueOf(i2));
                    }
                    sMTPTransport.sendCommand(strConcat);
                    this.out.write(bArr, i, i2);
                    this.out.flush();
                    if (SMTPTransport.this.readServerResponse() == 250) {
                    } else {
                        throw new IOException(SMTPTransport.this.lastServerResponse);
                    }
                } catch (MessagingException e) {
                    throw new IOException("BDAT write exception", e);
                }
            }
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            bdat(this.buf, 0, this.count, true);
            this.count = 0;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            bdat(this.buf, 0, this.count, false);
            this.count = 0;
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            byte[] bArr = this.buf;
            int i2 = this.count;
            int i3 = i2 + 1;
            this.count = i3;
            bArr[i2] = (byte) i;
            if (i3 >= bArr.length) {
                flush();
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            while (i2 > 0) {
                int iMin = Math.min(this.buf.length - this.count, i2);
                byte[] bArr2 = this.buf;
                if (iMin == bArr2.length) {
                    bdat(bArr, i, iMin, false);
                } else {
                    System.arraycopy(bArr, i, bArr2, this.count, iMin);
                    this.count += iMin;
                }
                i += iMin;
                i2 -= iMin;
                if (this.count >= this.buf.length) {
                    flush();
                }
            }
        }
    }

    public class DigestMD5Authenticator extends Authenticator {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        private DigestMD5 md5support;

        public DigestMD5Authenticator() {
            super(SMTPTransport.this, "DIGEST-MD5");
        }

        private synchronized DigestMD5 getMD5() {
            if (this.md5support == null) {
                this.md5support = new DigestMD5(SMTPTransport.this.logger);
            }
            return this.md5support;
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            DigestMD5 md5 = getMD5();
            int iSimpleCommand = SMTPTransport.this.simpleCommand(md5.authClient(str, str3, str4, SMTPTransport.this.getSASLRealm(), SMTPTransport.this.getLastServerResponse()));
            this.resp = iSimpleCommand;
            if (iSimpleCommand == 334) {
                if (md5.authServer(SMTPTransport.this.getLastServerResponse())) {
                    this.resp = SMTPTransport.this.simpleCommand(new byte[0]);
                } else {
                    this.resp = -1;
                }
            }
        }
    }

    public class LoginAuthenticator extends Authenticator {
        public LoginAuthenticator() {
            super(SMTPTransport.this, "LOGIN");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            int iSimpleCommand = SMTPTransport.this.simpleCommand(BASE64EncoderStream.encode(str3.getBytes(StandardCharsets.UTF_8)));
            this.resp = iSimpleCommand;
            if (iSimpleCommand == 334) {
                this.resp = SMTPTransport.this.simpleCommand(BASE64EncoderStream.encode(str4.getBytes(StandardCharsets.UTF_8)));
            }
        }
    }

    public class NtlmAuthenticator extends Authenticator {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        private Ntlm ntlm;

        public NtlmAuthenticator() {
            super(SMTPTransport.this, "NTLM");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            this.resp = SMTPTransport.this.simpleCommand(this.ntlm.generateType3Msg(SMTPTransport.this.getLastServerResponse().substring(4).trim()));
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public String getInitialResponse(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            this.ntlm = new Ntlm(SMTPTransport.this.getNTLMDomain(), SMTPTransport.this.getLocalHost(), str3, str4, SMTPTransport.this.logger);
            return this.ntlm.generateType1Msg(PropUtil.getIntProperty(SMTPTransport.this.session.getProperties(), "mail." + SMTPTransport.this.name + ".auth.ntlm.flags", 0), PropUtil.getBooleanProperty(SMTPTransport.this.session.getProperties(), "mail." + SMTPTransport.this.name + ".auth.ntlm.v2", true));
        }
    }

    public class OAuth2Authenticator extends Authenticator {
        public OAuth2Authenticator() {
            super("XOAUTH2", false);
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            throw new AuthenticationFailedException("OAUTH2 asked for more");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public String getInitialResponse(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            return ASCIIUtility.toString(BASE64EncoderStream.encode(("user=" + str3 + "\u0001auth=Bearer " + str4 + "\u0001\u0001").getBytes(StandardCharsets.UTF_8)));
        }
    }

    public class PlainAuthenticator extends Authenticator {
        public PlainAuthenticator() {
            super(SMTPTransport.this, "PLAIN");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            throw new AuthenticationFailedException("PLAIN asked for more");
        }

        @Override // com.sun.mail.smtp.SMTPTransport.Authenticator
        public String getInitialResponse(String str, String str2, String str3, String str4) throws MessagingException, IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
            if (str2 != null) {
                bASE64EncoderStream.write(str2.getBytes(StandardCharsets.UTF_8));
            }
            bASE64EncoderStream.write(0);
            bASE64EncoderStream.write(str3.getBytes(StandardCharsets.UTF_8));
            bASE64EncoderStream.write(0);
            bASE64EncoderStream.write(str4.getBytes(StandardCharsets.UTF_8));
            bASE64EncoderStream.flush();
            return ASCIIUtility.toString(byteArrayOutputStream.toByteArray());
        }
    }

    public SMTPTransport(Session session, URLName uRLName) {
        this(session, uRLName, "smtp", false);
    }

    public SMTPTransport(Session session, URLName uRLName, String str, boolean z) {
        super(session, uRLName);
        this.name = "smtp";
        this.defaultPort = 25;
        this.isSSL = false;
        this.sendPartiallyFailed = false;
        this.authenticators = new HashMap();
        this.quitWait = false;
        this.quitOnSessionReject = false;
        this.saslRealm = "UNKNOWN";
        this.authorizationID = "UNKNOWN";
        this.enableSASL = false;
        this.useCanonicalHostName = false;
        this.saslMechanisms = UNKNOWN_SA;
        this.ntlmDomain = "UNKNOWN";
        this.noopStrict = true;
        this.noauthdebug = true;
        Properties properties = session.getProperties();
        MailLogger mailLogger = new MailLogger(getClass(), "DEBUG SMTP", session.getDebug(), session.getDebugOut());
        this.logger = mailLogger;
        this.traceLogger = mailLogger.getSubLogger("protocol", null);
        this.noauthdebug = !PropUtil.getBooleanProperty(properties, "mail.debug.auth", false);
        this.debugusername = PropUtil.getBooleanProperty(properties, "mail.debug.auth.username", true);
        this.debugpassword = PropUtil.getBooleanProperty(properties, "mail.debug.auth.password", false);
        str = uRLName != null ? uRLName.getProtocol() : str;
        this.name = str;
        z = z ? z : PropUtil.getBooleanProperty(properties, "mail." + str + ".ssl.enable", false);
        if (z) {
            this.defaultPort = 465;
        } else {
            this.defaultPort = 25;
        }
        this.isSSL = z;
        this.quitWait = PropUtil.getBooleanProperty(properties, "mail." + str + ".quitwait", true);
        this.quitOnSessionReject = PropUtil.getBooleanProperty(properties, "mail." + str + ".quitonsessionreject", false);
        this.reportSuccess = PropUtil.getBooleanProperty(properties, "mail." + str + ".reportsuccess", false);
        this.useStartTLS = PropUtil.getBooleanProperty(properties, "mail." + str + ".starttls.enable", false);
        this.requireStartTLS = PropUtil.getBooleanProperty(properties, "mail." + str + ".starttls.required", false);
        this.useRset = PropUtil.getBooleanProperty(properties, "mail." + str + ".userset", false);
        this.noopStrict = PropUtil.getBooleanProperty(properties, "mail." + str + ".noop.strict", true);
        boolean booleanProperty = PropUtil.getBooleanProperty(properties, "mail." + str + ".sasl.enable", false);
        this.enableSASL = booleanProperty;
        if (booleanProperty) {
            this.logger.config("enable SASL");
        }
        boolean booleanProperty2 = PropUtil.getBooleanProperty(properties, "mail." + str + ".sasl.usecanonicalhostname", false);
        this.useCanonicalHostName = booleanProperty2;
        if (booleanProperty2) {
            this.logger.config("use canonical host name");
        }
        boolean booleanProperty3 = PropUtil.getBooleanProperty(properties, "mail.mime.allowutf8", false);
        this.allowutf8 = booleanProperty3;
        if (booleanProperty3) {
            this.logger.config("allow UTF-8");
        }
        int intProperty = PropUtil.getIntProperty(properties, "mail." + str + ".chunksize", -1);
        this.chunkSize = intProperty;
        if (intProperty > 0 && this.logger.isLoggable(Level.CONFIG)) {
            this.logger.config("chunk size " + this.chunkSize);
        }
        Authenticator[] authenticatorArr = {new LoginAuthenticator(), new PlainAuthenticator(), new DigestMD5Authenticator(), new NtlmAuthenticator(), new OAuth2Authenticator()};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            this.authenticators.put(authenticatorArr[i].getMechanism(), authenticatorArr[i]);
            sb.append(authenticatorArr[i].getMechanism());
            sb.append(' ');
        }
        this.defaultAuthenticationMechanisms = sb.toString();
    }

    private void addressesFailed() {
        Address[] addressArr = this.validSentAddr;
        if (addressArr != null) {
            Address[] addressArr2 = this.validUnsentAddr;
            if (addressArr2 == null) {
                this.validUnsentAddr = addressArr;
                this.validSentAddr = null;
                return;
            }
            Address[] addressArr3 = new Address[addressArr.length + addressArr2.length];
            System.arraycopy(addressArr, 0, addressArr3, 0, addressArr.length);
            Address[] addressArr4 = this.validUnsentAddr;
            System.arraycopy(addressArr4, 0, addressArr3, this.validSentAddr.length, addressArr4.length);
            this.validSentAddr = null;
            this.validUnsentAddr = addressArr3;
        }
    }

    private boolean authenticate(String str, String str2) throws MessagingException {
        MailLogger mailLogger;
        Level level;
        String str3;
        String property = this.session.getProperty("mail." + this.name + ".auth.mechanisms");
        if (property == null) {
            property = this.defaultAuthenticationMechanisms;
        }
        String authorizationId = getAuthorizationId();
        if (authorizationId == null) {
            authorizationId = str;
        }
        if (this.enableSASL) {
            this.logger.fine("Authenticate with SASL");
            try {
                if (sasllogin(getSASLMechanisms(), getSASLRealm(), authorizationId, str, str2)) {
                    return true;
                }
                this.logger.fine("SASL authentication failed");
                return false;
            } catch (UnsupportedOperationException e) {
                this.logger.log(Level.FINE, "SASL support failed", (Throwable) e);
            }
        }
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("Attempt to authenticate using mechanisms: ".concat(String.valueOf(property)));
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            Locale locale = Locale.ENGLISH;
            String upperCase = strNextToken.toUpperCase(locale);
            Authenticator authenticator = this.authenticators.get(upperCase);
            if (authenticator == null) {
                mailLogger = this.logger;
                level = Level.FINE;
                str3 = "no authenticator for mechanism {0}";
            } else {
                if (supportsAuthentication(upperCase)) {
                    if (property == this.defaultAuthenticationMechanisms) {
                        String str4 = "mail." + this.name + ".auth." + upperCase.toLowerCase(locale) + ".disable";
                        if (PropUtil.getBooleanProperty(this.session.getProperties(), str4, !authenticator.enabled())) {
                            if (this.logger.isLoggable(Level.FINE)) {
                                this.logger.fine("mechanism " + upperCase + " disabled by property: " + str4);
                            }
                        }
                    }
                    this.logger.log(Level.FINE, "Using mechanism {0}", upperCase);
                    return authenticator.authenticate(this.host, authorizationId, str, str2);
                }
                mailLogger = this.logger;
                level = Level.FINE;
                str3 = "mechanism {0} not supported by server";
            }
            mailLogger.log(level, str3, upperCase);
        }
        throw new AuthenticationFailedException("No authentication mechanisms supported by both server and client");
    }

    public void closeConnection() throws MessagingException {
        try {
            try {
                Socket socket = this.serverSocket;
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                throw new MessagingException("Server Close Failed", e);
            }
        } finally {
            this.serverSocket = null;
            this.serverOutput = null;
            this.serverInput = null;
            this.lineInputStream = null;
            if (super.isConnected()) {
                super.close();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean convertTo8Bit(MimePart mimePart) {
        boolean z = false;
        try {
            if (!mimePart.isMimeType("text/*")) {
                if (!mimePart.isMimeType("multipart/*")) {
                    return false;
                }
                MimeMultipart mimeMultipart = (MimeMultipart) mimePart.getContent();
                int count = mimeMultipart.getCount();
                boolean z3 = false;
                for (int i = 0; i < count; i++) {
                    try {
                        if (convertTo8Bit((MimePart) mimeMultipart.getBodyPart(i))) {
                            z3 = true;
                        }
                    } catch (IOException | MessagingException unused) {
                    }
                }
                return z3;
            }
            String encoding = mimePart.getEncoding();
            if (encoding == null) {
                return false;
            }
            if (!encoding.equalsIgnoreCase("quoted-printable") && !encoding.equalsIgnoreCase("base64")) {
                return false;
            }
            InputStream inputStream = null;
            try {
                inputStream = mimePart.getInputStream();
                if (is8Bit(inputStream)) {
                    mimePart.setContent(mimePart.getContent(), mimePart.getContentType());
                    mimePart.setHeader(MIME.CONTENT_TRANSFER_ENC, MIME.ENC_8BIT);
                    z = true;
                }
                if (inputStream == null) {
                    return z;
                }
                inputStream.close();
                return z;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | MessagingException unused3) {
            return false;
        }
    }

    private void expandGroups() {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            Address[] addressArr = this.addresses;
            if (i >= addressArr.length) {
                break;
            }
            InternetAddress internetAddress = (InternetAddress) addressArr[i];
            if (internetAddress.isGroup()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(this.addresses[i2]);
                    }
                }
                try {
                    InternetAddress[] group = internetAddress.getGroup(true);
                    if (group != null) {
                        for (InternetAddress internetAddress2 : group) {
                            arrayList.add(internetAddress2);
                        }
                    } else {
                        arrayList.add(internetAddress);
                    }
                } catch (ParseException unused) {
                    arrayList.add(internetAddress);
                }
            } else if (arrayList != null) {
                arrayList.add(internetAddress);
            }
            i++;
        }
        if (arrayList != null) {
            InternetAddress[] internetAddressArr = new InternetAddress[arrayList.size()];
            arrayList.toArray(internetAddressArr);
            this.addresses = internetAddressArr;
        }
    }

    private void initStreams() throws IOException {
        boolean booleanProperty = PropUtil.getBooleanProperty(this.session.getProperties(), "mail.debug.quote", false);
        TraceInputStream traceInputStream = new TraceInputStream(this.serverSocket.getInputStream(), this.traceLogger);
        this.traceInput = traceInputStream;
        traceInputStream.setQuote(booleanProperty);
        TraceOutputStream traceOutputStream = new TraceOutputStream(this.serverSocket.getOutputStream(), this.traceLogger);
        this.traceOutput = traceOutputStream;
        traceOutputStream.setQuote(booleanProperty);
        this.serverOutput = new BufferedOutputStream(this.traceOutput);
        this.serverInput = new BufferedInputStream(this.traceInput);
        this.lineInputStream = new LineInputStream(this.serverInput);
    }

    private boolean is8Bit(InputStream inputStream) {
        boolean z = false;
        int i = 0;
        while (true) {
            try {
                int i2 = inputStream.read();
                if (i2 < 0) {
                    if (z) {
                        this.logger.fine("found an 8bit part");
                    }
                    return z;
                }
                int i3 = i2 & 255;
                if (i3 == 13 || i3 == 10) {
                    i = 0;
                } else if (i3 == 0 || (i = i + 1) > 998) {
                    return false;
                }
                if (i3 > 127) {
                    z = true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    private boolean isNotLastLine(String str) {
        return str != null && str.length() >= 4 && str.charAt(3) == '-';
    }

    public boolean isTracing() {
        return this.traceLogger.isLoggable(Level.FINEST);
    }

    private void issueSendCommand(String str, int i) throws MessagingException {
        sendCommand(str);
        int serverResponse = readServerResponse();
        if (serverResponse != i) {
            Address[] addressArr = this.validSentAddr;
            int length = addressArr == null ? 0 : addressArr.length;
            Address[] addressArr2 = this.validUnsentAddr;
            int length2 = addressArr2 == null ? 0 : addressArr2.length;
            Address[] addressArr3 = new Address[length + length2];
            if (length > 0) {
                System.arraycopy(addressArr, 0, addressArr3, 0, length);
            }
            if (length2 > 0) {
                System.arraycopy(this.validUnsentAddr, 0, addressArr3, length, length2);
            }
            this.validSentAddr = null;
            this.validUnsentAddr = addressArr3;
            if (this.logger.isLoggable(Level.FINE)) {
                this.logger.fine("got response code " + serverResponse + ", with response: " + this.lastServerResponse);
            }
            String str2 = this.lastServerResponse;
            int i2 = this.lastReturnCode;
            if (this.serverSocket != null) {
                issueCommand("RSET", -1);
            }
            this.lastServerResponse = str2;
            this.lastReturnCode = i2;
            throw new SMTPSendFailedException(str, serverResponse, this.lastServerResponse, this.exception, this.validSentAddr, this.validUnsentAddr, this.invalidAddr);
        }
    }

    private String normalizeAddress(String str) {
        if (str.startsWith("<") || str.endsWith(">")) {
            return str;
        }
        return "<" + str + ">";
    }

    private void openServer() throws MessagingException {
        IOException e;
        int port;
        int serverResponse;
        this.host = "UNKNOWN";
        try {
            port = this.serverSocket.getPort();
            try {
                this.host = this.serverSocket.getInetAddress().getHostName();
                MailLogger mailLogger = this.logger;
                Level level = Level.FINE;
                if (mailLogger.isLoggable(level)) {
                    this.logger.fine("starting protocol to host \"" + this.host + "\", port " + port);
                }
                initStreams();
                int serverResponse2 = readServerResponse();
                if (serverResponse2 == 220) {
                    if (this.logger.isLoggable(level)) {
                        this.logger.fine("protocol started to host \"" + this.host + "\", port: " + port);
                        return;
                    }
                    return;
                }
                try {
                    try {
                        if (this.quitOnSessionReject) {
                            sendCommand("QUIT");
                            if (this.quitWait && (serverResponse = readServerResponse()) != 221 && serverResponse != -1 && this.logger.isLoggable(level)) {
                                this.logger.fine("QUIT failed with ".concat(String.valueOf(serverResponse)));
                            }
                        }
                        this.serverSocket.close();
                        this.serverSocket = null;
                        this.serverOutput = null;
                        this.serverInput = null;
                    } catch (Exception e2) {
                        MailLogger mailLogger2 = this.logger;
                        Level level2 = Level.FINE;
                        if (mailLogger2.isLoggable(level2)) {
                            this.logger.log(level2, "QUIT failed", (Throwable) e2);
                        }
                        this.serverSocket.close();
                        this.serverSocket = null;
                        this.serverOutput = null;
                        this.serverInput = null;
                    }
                    this.lineInputStream = null;
                    if (this.logger.isLoggable(Level.FINE)) {
                        this.logger.fine("got bad greeting from host \"" + this.host + "\", port: " + port + ", response: " + serverResponse2);
                    }
                    throw new MessagingException("Got bad greeting from SMTP host: " + this.host + ", port: " + port + ", response: " + serverResponse2);
                } catch (Throwable th) {
                    this.serverSocket.close();
                    this.serverSocket = null;
                    this.serverOutput = null;
                    this.serverInput = null;
                    this.lineInputStream = null;
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                throw new MessagingException("Could not start protocol to SMTP host: " + this.host + ", port: " + port, e);
            }
        } catch (IOException e4) {
            e = e4;
            port = -1;
        }
    }

    private void openServer(String str, int i) throws MessagingException {
        int serverResponse;
        MailLogger mailLogger = this.logger;
        Level level = Level.FINE;
        if (mailLogger.isLoggable(level)) {
            this.logger.fine("trying to connect to host \"" + str + "\", port " + i + ", isSSL " + this.isSSL);
        }
        try {
            Socket socket = SocketFetcher.getSocket(str, i, this.session.getProperties(), "mail." + this.name, this.isSSL);
            this.serverSocket = socket;
            int port = socket.getPort();
            this.host = str;
            initStreams();
            if (readServerResponse() == 220) {
                if (this.logger.isLoggable(level)) {
                    this.logger.fine("connected to host \"" + str + "\", port: " + port);
                    return;
                }
                return;
            }
            String str2 = this.lastServerResponse;
            try {
                try {
                    if (this.quitOnSessionReject) {
                        sendCommand("QUIT");
                        if (this.quitWait && (serverResponse = readServerResponse()) != 221 && serverResponse != -1 && this.logger.isLoggable(level)) {
                            this.logger.fine("QUIT failed with ".concat(String.valueOf(serverResponse)));
                        }
                    }
                    this.serverSocket.close();
                    this.serverSocket = null;
                    this.serverOutput = null;
                    this.serverInput = null;
                } catch (Exception e) {
                    MailLogger mailLogger2 = this.logger;
                    Level level2 = Level.FINE;
                    if (mailLogger2.isLoggable(level2)) {
                        this.logger.log(level2, "QUIT failed", (Throwable) e);
                    }
                    this.serverSocket.close();
                    this.serverSocket = null;
                    this.serverOutput = null;
                    this.serverInput = null;
                }
                this.lineInputStream = null;
                if (this.logger.isLoggable(Level.FINE)) {
                    this.logger.fine("got bad greeting from host \"" + str + "\", port: " + port + ", response: " + str2);
                }
                throw new MessagingException("Got bad greeting from SMTP host: " + str + ", port: " + port + ", response: " + str2);
            } catch (Throwable th) {
                this.serverSocket.close();
                this.serverSocket = null;
                this.serverOutput = null;
                this.serverInput = null;
                this.lineInputStream = null;
                throw th;
            }
        } catch (SocketConnectException e2) {
            throw new MailConnectException(e2);
        } catch (UnknownHostException e3) {
            throw new MessagingException("Unknown SMTP host: ".concat(String.valueOf(str)), e3);
        } catch (IOException e4) {
            throw new MessagingException("Could not connect to SMTP host: " + str + ", port: " + i, e4);
        }
    }

    public void resumeTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(true);
            this.traceOutput.setTrace(true);
        }
    }

    private boolean sasllogin(String[] strArr, String str, String str2, String str3, String str4) throws MessagingException {
        ArrayList arrayList;
        String str5;
        String canonicalHostName = this.useCanonicalHostName ? this.serverSocket.getInetAddress().getCanonicalHostName() : this.host;
        if (this.saslAuthenticator == null) {
            try {
                this.saslAuthenticator = (SaslAuthenticator) Class.forName("com.sun.mail.smtp.SMTPSaslAuthenticator").getConstructor(SMTPTransport.class, String.class, Properties.class, MailLogger.class, String.class).newInstance(this, this.name, this.session.getProperties(), this.logger, canonicalHostName);
            } catch (Exception e) {
                this.logger.log(Level.FINE, "Can't load SASL authenticator", (Throwable) e);
                return false;
            }
        }
        if (strArr == null || strArr.length <= 0) {
            arrayList = new ArrayList();
            Hashtable<String, String> hashtable = this.extMap;
            if (hashtable != null && (str5 = hashtable.get("AUTH")) != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(str5);
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(stringTokenizer.nextToken());
                }
            }
        } else {
            arrayList = new ArrayList(strArr.length);
            for (int i = 0; i < strArr.length; i++) {
                if (supportsAuthentication(strArr[i])) {
                    arrayList.add(strArr[i]);
                }
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        try {
            if (this.noauthdebug && isTracing()) {
                this.logger.fine("SASL AUTH command trace suppressed");
                suspendTracing();
            }
            return this.saslAuthenticator.authenticate(strArr2, str, str2, str3, str4);
        } finally {
            resumeTracing();
        }
    }

    private void sendCommand(byte[] bArr) throws MessagingException {
        try {
            this.serverOutput.write(bArr);
            this.serverOutput.write(CRLF);
            this.serverOutput.flush();
        } catch (IOException e) {
            throw new MessagingException("Can't send command to SMTP host", e);
        }
    }

    private void sendMessageEnd() {
    }

    private void sendMessageStart(String str) {
    }

    public void suspendTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(false);
            this.traceOutput.setTrace(false);
        }
    }

    private byte[] toBytes(String str) {
        return this.allowutf8 ? str.getBytes(StandardCharsets.UTF_8) : ASCIIUtility.getBytes(str);
    }

    private String tracePassword(String str) {
        return this.debugpassword ? str : str == null ? "<null>" : "<non-null>";
    }

    private String traceUser(String str) {
        return this.debugusername ? str : "<user name suppressed>";
    }

    public static String xtext(String str) {
        return xtext(str, false);
    }

    public static String xtext(String str, boolean z) {
        byte[] bytes = z ? str.getBytes(StandardCharsets.UTF_8) : ASCIIUtility.getBytes(str);
        StringBuilder sb = null;
        for (int i = 0; i < bytes.length; i++) {
            char c = (char) (bytes[i] & 255);
            if (!z && c >= 128) {
                throw new IllegalArgumentException("Non-ASCII character in SMTP submitter: ".concat(String.valueOf(str)));
            }
            if (c < '!' || c > '~' || c == '+' || c == '=') {
                if (sb == null) {
                    sb = new StringBuilder(str.length() + 4);
                    sb.append(str.substring(0, i));
                }
                sb.append('+');
                sb.append(hexchar[(c & C4032jp.OooO) >> 4]);
                c = hexchar[c & 15];
            } else {
                if (sb != null) {
                }
            }
            sb.append(c);
        }
        return sb != null ? sb.toString() : str;
    }

    public OutputStream bdat() throws MessagingException {
        BDATOutputStream bDATOutputStream = new BDATOutputStream(this.serverOutput, this.chunkSize);
        this.dataStream = bDATOutputStream;
        return bDATOutputStream;
    }

    public void checkConnected() {
        if (!super.isConnected()) {
            throw new IllegalStateException("Not connected");
        }
    }

    @Override // javax.mail.Service, java.lang.AutoCloseable
    public synchronized void close() throws MessagingException {
        int serverResponse;
        if (super.isConnected()) {
            try {
                if (this.serverSocket != null) {
                    sendCommand("QUIT");
                    if (this.quitWait && (serverResponse = readServerResponse()) != 221 && serverResponse != -1 && this.logger.isLoggable(Level.FINE)) {
                        this.logger.fine("QUIT failed with ".concat(String.valueOf(serverResponse)));
                    }
                }
            } finally {
                closeConnection();
            }
        }
    }

    public synchronized void connect(Socket socket) throws MessagingException {
        this.serverSocket = socket;
        super.connect();
    }

    public OutputStream data() throws MessagingException {
        issueSendCommand("DATA", 354);
        SMTPOutputStream sMTPOutputStream = new SMTPOutputStream(this.serverOutput);
        this.dataStream = sMTPOutputStream;
        return sMTPOutputStream;
    }

    public boolean ehlo(String str) throws MessagingException {
        sendCommand(str != null ? "EHLO ".concat(String.valueOf(str)) : "EHLO");
        int serverResponse = readServerResponse();
        if (serverResponse == 250) {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(this.lastServerResponse));
            this.extMap = new Hashtable<>();
            boolean z = true;
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else if (line.length() >= 5) {
                        String strSubstring = line.substring(4);
                        int iIndexOf = strSubstring.indexOf(32);
                        String strSubstring2 = "";
                        if (iIndexOf > 0) {
                            strSubstring2 = strSubstring.substring(iIndexOf + 1);
                            strSubstring = strSubstring.substring(0, iIndexOf);
                        }
                        if (this.logger.isLoggable(Level.FINE)) {
                            this.logger.fine("Found extension \"" + strSubstring + "\", arg \"" + strSubstring2 + "\"");
                        }
                        this.extMap.put(strSubstring.toUpperCase(Locale.ENGLISH), strSubstring2);
                    }
                } catch (IOException unused) {
                }
            }
        }
        return serverResponse == 250;
    }

    @Override // javax.mail.Service
    public void finalize() throws Throwable {
        try {
            closeConnection();
        } catch (MessagingException unused) {
        } finally {
            super.finalize();
        }
    }

    public void finishBdat() throws MessagingException, IOException {
        this.dataStream.ensureAtBOL();
        this.dataStream.close();
    }

    public void finishData() throws MessagingException, IOException {
        this.dataStream.ensureAtBOL();
        issueSendCommand(".", 250);
    }

    public synchronized String getAuthorizationId() {
        if (this.authorizationID == "UNKNOWN") {
            this.authorizationID = this.session.getProperty("mail." + this.name + ".sasl.authorizationid");
        }
        return this.authorizationID;
    }

    public String getExtensionParameter(String str) {
        Hashtable<String, String> hashtable = this.extMap;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(str.toUpperCase(Locale.ENGLISH));
    }

    public synchronized int getLastReturnCode() {
        return this.lastReturnCode;
    }

    public synchronized String getLastServerResponse() {
        return this.lastServerResponse;
    }

    public synchronized String getLocalHost() {
        Socket socket;
        String str = this.localHostName;
        if (str == null || str.length() <= 0) {
            this.localHostName = this.session.getProperty("mail." + this.name + ".localhost");
        }
        String str2 = this.localHostName;
        if (str2 == null || str2.length() <= 0) {
            this.localHostName = this.session.getProperty("mail." + this.name + ".localaddress");
        }
        try {
            String str3 = this.localHostName;
            if (str3 == null || str3.length() <= 0) {
                InetAddress localHost = InetAddress.getLocalHost();
                String canonicalHostName = localHost.getCanonicalHostName();
                this.localHostName = canonicalHostName;
                if (canonicalHostName == null) {
                    this.localHostName = "[" + localHost.getHostAddress() + "]";
                }
            }
        } catch (UnknownHostException unused) {
        }
        String str4 = this.localHostName;
        if ((str4 == null || str4.length() <= 0) && (socket = this.serverSocket) != null && socket.isBound()) {
            InetAddress localAddress = this.serverSocket.getLocalAddress();
            String canonicalHostName2 = localAddress.getCanonicalHostName();
            this.localHostName = canonicalHostName2;
            if (canonicalHostName2 == null) {
                this.localHostName = "[" + localAddress.getHostAddress() + "]";
            }
        }
        return this.localHostName;
    }

    public synchronized String getNTLMDomain() {
        if (this.ntlmDomain == "UNKNOWN") {
            this.ntlmDomain = this.session.getProperty("mail." + this.name + ".auth.ntlm.domain");
        }
        return this.ntlmDomain;
    }

    public synchronized boolean getNoopStrict() {
        return this.noopStrict;
    }

    public synchronized boolean getReportSuccess() {
        return this.reportSuccess;
    }

    public synchronized boolean getRequireStartTLS() {
        return this.requireStartTLS;
    }

    public synchronized boolean getSASLEnabled() {
        return this.enableSASL;
    }

    public synchronized String[] getSASLMechanisms() {
        if (this.saslMechanisms == UNKNOWN_SA) {
            ArrayList arrayList = new ArrayList(5);
            String property = this.session.getProperty("mail." + this.name + ".sasl.mechanisms");
            if (property != null && property.length() > 0) {
                if (this.logger.isLoggable(Level.FINE)) {
                    this.logger.fine("SASL mechanisms allowed: ".concat(String.valueOf(property)));
                }
                StringTokenizer stringTokenizer = new StringTokenizer(property, " ,");
                while (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    if (strNextToken.length() > 0) {
                        arrayList.add(strNextToken);
                    }
                }
            }
            String[] strArr = new String[arrayList.size()];
            this.saslMechanisms = strArr;
            arrayList.toArray(strArr);
        }
        String[] strArr2 = this.saslMechanisms;
        if (strArr2 == null) {
            return null;
        }
        return (String[]) strArr2.clone();
    }

    public synchronized String getSASLRealm() {
        if (this.saslRealm == "UNKNOWN") {
            String property = this.session.getProperty("mail." + this.name + ".sasl.realm");
            this.saslRealm = property;
            if (property == null) {
                this.saslRealm = this.session.getProperty("mail." + this.name + ".saslrealm");
            }
        }
        return this.saslRealm;
    }

    public synchronized boolean getStartTLS() {
        return this.useStartTLS;
    }

    public synchronized boolean getUseCanonicalHostName() {
        return this.useCanonicalHostName;
    }

    public synchronized boolean getUseRset() {
        return this.useRset;
    }

    public void helo(String str) throws MessagingException {
        issueCommand(str != null ? "HELO ".concat(String.valueOf(str)) : "HELO", 250);
    }

    @Override // javax.mail.Service
    public synchronized boolean isConnected() {
        if (!super.isConnected()) {
            return false;
        }
        try {
            try {
                sendCommand(this.useRset ? "RSET" : "NOOP");
                int serverResponse = readServerResponse();
                if (serverResponse >= 0 && (!this.noopStrict ? serverResponse == 421 : serverResponse != 250)) {
                    return true;
                }
                try {
                    closeConnection();
                } catch (MessagingException unused) {
                }
                return false;
            } catch (Exception unused2) {
                closeConnection();
            }
        } catch (MessagingException unused3) {
        }
        return false;
    }

    public synchronized boolean isSSL() {
        return this.serverSocket instanceof SSLSocket;
    }

    public synchronized void issueCommand(String str, int i) throws MessagingException {
        sendCommand(str);
        int serverResponse = readServerResponse();
        if (i != -1 && serverResponse != i) {
            throw new MessagingException(this.lastServerResponse);
        }
    }

    public void mailFrom() throws MessagingException {
        Address[] from;
        MimeMessage mimeMessage = this.message;
        String envelopeFrom = mimeMessage instanceof SMTPMessage ? ((SMTPMessage) mimeMessage).getEnvelopeFrom() : null;
        if (envelopeFrom == null || envelopeFrom.length() <= 0) {
            envelopeFrom = this.session.getProperty("mail." + this.name + ".from");
        }
        boolean z = false;
        if (envelopeFrom == null || envelopeFrom.length() <= 0) {
            MimeMessage mimeMessage2 = this.message;
            Address localAddress = (mimeMessage2 == null || (from = mimeMessage2.getFrom()) == null || from.length <= 0) ? InternetAddress.getLocalAddress(this.session) : from[0];
            if (localAddress == null) {
                throw new MessagingException("can't determine local email address");
            }
            envelopeFrom = ((InternetAddress) localAddress).getAddress();
        }
        String str = "MAIL FROM:" + normalizeAddress(envelopeFrom);
        if (this.allowutf8 && supportsExtension("SMTPUTF8")) {
            str = str + " SMTPUTF8";
        }
        if (supportsExtension("DSN")) {
            MimeMessage mimeMessage3 = this.message;
            String dSNRet = mimeMessage3 instanceof SMTPMessage ? ((SMTPMessage) mimeMessage3).getDSNRet() : null;
            if (dSNRet == null) {
                dSNRet = this.session.getProperty("mail." + this.name + ".dsn.ret");
            }
            if (dSNRet != null) {
                str = str + " RET=" + dSNRet;
            }
        }
        if (supportsExtension("AUTH")) {
            MimeMessage mimeMessage4 = this.message;
            String submitter = mimeMessage4 instanceof SMTPMessage ? ((SMTPMessage) mimeMessage4).getSubmitter() : null;
            if (submitter == null) {
                submitter = this.session.getProperty("mail." + this.name + ".submitter");
            }
            if (submitter != null) {
                try {
                    if (this.allowutf8 && supportsExtension("SMTPUTF8")) {
                        z = true;
                    }
                    str = str + " AUTH=" + xtext(submitter, z);
                } catch (IllegalArgumentException e) {
                    MailLogger mailLogger = this.logger;
                    Level level = Level.FINE;
                    if (mailLogger.isLoggable(level)) {
                        this.logger.log(level, "ignoring invalid submitter: ".concat(String.valueOf(submitter)), (Throwable) e);
                    }
                }
            }
        }
        MimeMessage mimeMessage5 = this.message;
        String mailExtension = mimeMessage5 instanceof SMTPMessage ? ((SMTPMessage) mimeMessage5).getMailExtension() : null;
        if (mailExtension == null) {
            mailExtension = this.session.getProperty("mail." + this.name + ".mailextension");
        }
        if (mailExtension != null && mailExtension.length() > 0) {
            str = str + C4196o4.OooO00o.OooO0Oo + mailExtension;
        }
        try {
            issueSendCommand(str, 250);
        } catch (SMTPSendFailedException e2) {
            int returnCode = e2.getReturnCode();
            if (returnCode == 501 || returnCode == 503 || returnCode == 553 || returnCode == 550 || returnCode == 551) {
                try {
                    e2.setNextException(new SMTPSenderFailedException(new InternetAddress(envelopeFrom), str, returnCode, e2.getMessage()));
                } catch (AddressException unused) {
                }
            }
            throw e2;
        }
    }

    @Override // javax.mail.Transport
    public void notifyTransportListeners(int i, Address[] addressArr, Address[] addressArr2, Address[] addressArr3, Message message) {
        if (this.notificationDone) {
            return;
        }
        super.notifyTransportListeners(i, addressArr, addressArr2, addressArr3, message);
        this.notificationDone = true;
    }

    @Override // javax.mail.Service
    public synchronized boolean protocolConnect(String str, int i, String str2, String str3) throws MessagingException {
        Properties properties = this.session.getProperties();
        boolean booleanProperty = PropUtil.getBooleanProperty(properties, "mail." + this.name + ".auth", false);
        if (booleanProperty && (str2 == null || str3 == null)) {
            if (this.logger.isLoggable(Level.FINE)) {
                this.logger.fine("need username and password for authentication");
                this.logger.fine("protocolConnect returning false, host=" + str + ", user=" + traceUser(str2) + ", password=" + tracePassword(str3));
            }
            return false;
        }
        boolean booleanProperty2 = PropUtil.getBooleanProperty(properties, "mail." + this.name + ".ehlo", true);
        MailLogger mailLogger = this.logger;
        Level level = Level.FINE;
        if (mailLogger.isLoggable(level)) {
            this.logger.fine("useEhlo " + booleanProperty2 + ", useAuth " + booleanProperty);
        }
        if (i == -1) {
            i = PropUtil.getIntProperty(properties, "mail." + this.name + ".port", -1);
        }
        if (i == -1) {
            i = this.defaultPort;
        }
        if (str == null || str.length() == 0) {
            str = "localhost";
        }
        try {
            if (this.serverSocket != null) {
                openServer();
            } else {
                openServer(str, i);
            }
            if (!(booleanProperty2 ? ehlo(getLocalHost()) : false)) {
                helo(getLocalHost());
            }
            if (this.useStartTLS || this.requireStartTLS) {
                if (this.serverSocket instanceof SSLSocket) {
                    this.logger.fine("STARTTLS requested but already using SSL");
                } else if (supportsExtension("STARTTLS")) {
                    startTLS();
                    ehlo(getLocalHost());
                } else if (this.requireStartTLS) {
                    this.logger.fine("STARTTLS required but not supported");
                    throw new MessagingException("STARTTLS is required but host does not support STARTTLS");
                }
            }
            if (this.allowutf8 && !supportsExtension("SMTPUTF8")) {
                this.logger.log(Level.INFO, "mail.mime.allowutf8 set but server doesn't advertise SMTPUTF8 support");
            }
            if ((!booleanProperty && (str2 == null || str3 == null)) || (!supportsExtension("AUTH") && !supportsExtension("AUTH=LOGIN"))) {
                return true;
            }
            if (this.logger.isLoggable(level)) {
                this.logger.fine("protocolConnect login, host=" + str + ", user=" + traceUser(str2) + ", password=" + tracePassword(str3));
            }
            boolean zAuthenticate = authenticate(str2, str3);
            if (!zAuthenticate) {
            }
            return zAuthenticate;
        } finally {
            try {
                closeConnection();
            } catch (MessagingException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x010d, code lost:
    
        if (r16.logger.isLoggable(java.util.logging.Level.FINE) == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x010f, code lost:
    
        r16.logger.fine("got response code " + r13 + ", with response: " + r16.lastServerResponse);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x012c, code lost:
    
        r0 = r16.lastServerResponse;
        r1 = r16.lastReturnCode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0132, code lost:
    
        if (r16.serverSocket == null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0134, code lost:
    
        issueCommand("RSET", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0137, code lost:
    
        r16.lastServerResponse = r0;
        r16.lastReturnCode = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0140, code lost:
    
        throw new com.sun.mail.smtp.SMTPAddressFailedException(r11, r6, r13, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0151 A[PHI: r9 r10
  0x0151: PHI (r9v4 java.lang.Exception) = (r9v2 java.lang.Exception), (r9v7 java.lang.Exception), (r9v9 java.lang.Exception), (r9v13 java.lang.Exception) binds: [B:238:0x0173, B:233:0x0162, B:227:0x014e, B:214:0x0101] A[DONT_GENERATE, DONT_INLINE]
  0x0151: PHI (r10v7 boolean) = (r10v1 boolean), (r10v8 boolean), (r10v10 boolean), (r10v12 boolean) binds: [B:238:0x0173, B:233:0x0162, B:227:0x014e, B:214:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0175 A[PHI: r9 r10
  0x0175: PHI (r9v3 java.lang.Exception) = (r9v2 java.lang.Exception), (r9v7 java.lang.Exception), (r9v9 java.lang.Exception), (r9v13 java.lang.Exception) binds: [B:238:0x0173, B:233:0x0162, B:227:0x014e, B:214:0x0101] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r10v5 boolean) = (r10v1 boolean), (r10v8 boolean), (r10v10 boolean), (r10v12 boolean) binds: [B:238:0x0173, B:233:0x0162, B:227:0x014e, B:214:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x017b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void rcptTo() throws javax.mail.MessagingException {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.rcptTo():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int readServerResponse() throws javax.mail.MessagingException {
        /*
            r6 = this;
            java.lang.String r0 = "close failed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
        L9:
            r2 = 0
            com.sun.mail.util.LineInputStream r3 = r6.lineInputStream     // Catch: java.io.IOException -> L73
            java.lang.String r3 = r3.readLine()     // Catch: java.io.IOException -> L73
            r4 = -1
            if (r3 != 0) goto L2d
            java.lang.String r0 = r1.toString()     // Catch: java.io.IOException -> L73
            int r1 = r0.length()     // Catch: java.io.IOException -> L73
            if (r1 != 0) goto L1f
            java.lang.String r0 = "[EOF]"
        L1f:
            r6.lastServerResponse = r0     // Catch: java.io.IOException -> L73
            r6.lastReturnCode = r4     // Catch: java.io.IOException -> L73
            com.sun.mail.util.MailLogger r1 = r6.logger     // Catch: java.io.IOException -> L73
            java.util.logging.Level r3 = java.util.logging.Level.FINE     // Catch: java.io.IOException -> L73
            java.lang.String r5 = "EOF: {0}"
            r1.log(r3, r5, r0)     // Catch: java.io.IOException -> L73
            return r4
        L2d:
            r1.append(r3)     // Catch: java.io.IOException -> L73
            java.lang.String r5 = "\n"
            r1.append(r5)     // Catch: java.io.IOException -> L73
            boolean r3 = r6.isNotLastLine(r3)     // Catch: java.io.IOException -> L73
            if (r3 != 0) goto L9
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L73
            int r3 = r1.length()
            r5 = 3
            if (r3 < r5) goto L62
            java.lang.String r2 = r1.substring(r2, r5)     // Catch: java.lang.StringIndexOutOfBoundsException -> L4f java.lang.NumberFormatException -> L5c
            int r0 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.StringIndexOutOfBoundsException -> L4f java.lang.NumberFormatException -> L5c
            goto L63
        L4f:
            r6.close()     // Catch: javax.mail.MessagingException -> L53
            goto L62
        L53:
            r2 = move-exception
        L54:
            com.sun.mail.util.MailLogger r3 = r6.logger
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            r3.log(r5, r0, r2)
            goto L62
        L5c:
            r6.close()     // Catch: javax.mail.MessagingException -> L60
            goto L62
        L60:
            r2 = move-exception
            goto L54
        L62:
            r0 = -1
        L63:
            if (r0 != r4) goto L6e
            com.sun.mail.util.MailLogger r2 = r6.logger
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r4 = "bad server response: {0}"
            r2.log(r3, r4, r1)
        L6e:
            r6.lastServerResponse = r1
            r6.lastReturnCode = r0
            return r0
        L73:
            r0 = move-exception
            com.sun.mail.util.MailLogger r1 = r6.logger
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r4 = "exception reading response"
            r1.log(r3, r4, r0)
            java.lang.String r1 = ""
            r6.lastServerResponse = r1
            r6.lastReturnCode = r2
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.String r2 = "Exception reading response"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.smtp.SMTPTransport.readServerResponse():int");
    }

    public void sendCommand(String str) throws MessagingException {
        sendCommand(toBytes(str));
    }

    @Override // javax.mail.Transport
    public synchronized void sendMessage(Message message, Address[] addressArr) throws MessagingException {
        sendMessageStart(message != null ? message.getSubject() : "");
        checkConnected();
        if (!(message instanceof MimeMessage)) {
            this.logger.fine("Can only send RFC822 msgs");
            throw new MessagingException("SMTP can only send RFC822 messages");
        }
        if (addressArr == null || addressArr.length == 0) {
            throw new SendFailedException("No recipient addresses");
        }
        for (int i = 0; i < addressArr.length; i++) {
            if (!(addressArr[i] instanceof InternetAddress)) {
                throw new MessagingException(addressArr[i] + " is not an InternetAddress");
            }
        }
        this.message = (MimeMessage) message;
        this.addresses = addressArr;
        this.validUnsentAddr = addressArr;
        expandGroups();
        boolean allow8bitMIME = message instanceof SMTPMessage ? ((SMTPMessage) message).getAllow8bitMIME() : false;
        if (!allow8bitMIME) {
            allow8bitMIME = PropUtil.getBooleanProperty(this.session.getProperties(), "mail." + this.name + ".allow8bitmime", false);
        }
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("use8bit ".concat(String.valueOf(allow8bitMIME)));
        }
        if (allow8bitMIME && supportsExtension("8BITMIME") && convertTo8Bit(this.message)) {
            try {
                this.message.saveChanges();
            } catch (MessagingException unused) {
            }
        }
        try {
            try {
                mailFrom();
                rcptTo();
                if (this.chunkSize <= 0 || !supportsExtension("CHUNKING")) {
                    this.message.writeTo(data(), ignoreList);
                    finishData();
                } else {
                    this.message.writeTo(bdat(), ignoreList);
                    finishBdat();
                }
                if (this.sendPartiallyFailed) {
                    this.logger.fine("Sending partially failed because of invalid destination addresses");
                    notifyTransportListeners(3, this.validSentAddr, this.validUnsentAddr, this.invalidAddr, this.message);
                    throw new SMTPSendFailedException(".", this.lastReturnCode, this.lastServerResponse, this.exception, this.validSentAddr, this.validUnsentAddr, this.invalidAddr);
                }
                this.logger.fine("message successfully delivered to mail server");
                notifyTransportListeners(1, this.validSentAddr, this.validUnsentAddr, this.invalidAddr, this.message);
                this.invalidAddr = null;
                this.validUnsentAddr = null;
                this.validSentAddr = null;
                this.addresses = null;
                this.message = null;
                this.exception = null;
                this.sendPartiallyFailed = false;
                this.notificationDone = false;
                sendMessageEnd();
            } catch (IOException e) {
                this.logger.log(Level.FINE, "IOException while sending, closing", (Throwable) e);
                try {
                    closeConnection();
                } catch (MessagingException unused2) {
                }
                addressesFailed();
                notifyTransportListeners(2, this.validSentAddr, this.validUnsentAddr, this.invalidAddr, this.message);
                throw new MessagingException("IOException while sending message", e);
            } catch (MessagingException e2) {
                this.logger.log(Level.FINE, "MessagingException while sending", (Throwable) e2);
                if (e2.getNextException() instanceof IOException) {
                    this.logger.fine("nested IOException, closing");
                    try {
                        closeConnection();
                    } catch (MessagingException unused3) {
                    }
                }
                addressesFailed();
                notifyTransportListeners(2, this.validSentAddr, this.validUnsentAddr, this.invalidAddr, this.message);
                throw e2;
            }
        } catch (Throwable th) {
            this.invalidAddr = null;
            this.validUnsentAddr = null;
            this.validSentAddr = null;
            this.addresses = null;
            this.message = null;
            this.exception = null;
            this.sendPartiallyFailed = false;
            this.notificationDone = false;
            throw th;
        }
    }

    public synchronized void setAuthorizationID(String str) {
        this.authorizationID = str;
    }

    public synchronized void setLocalHost(String str) {
        this.localHostName = str;
    }

    public synchronized void setNTLMDomain(String str) {
        this.ntlmDomain = str;
    }

    public synchronized void setNoopStrict(boolean z) {
        this.noopStrict = z;
    }

    public synchronized void setReportSuccess(boolean z) {
        this.reportSuccess = z;
    }

    public synchronized void setRequireStartTLS(boolean z) {
        this.requireStartTLS = z;
    }

    public synchronized void setSASLEnabled(boolean z) {
        this.enableSASL = z;
    }

    public synchronized void setSASLMechanisms(String[] strArr) {
        if (strArr != null) {
            strArr = (String[]) strArr.clone();
            this.saslMechanisms = strArr;
        } else {
            this.saslMechanisms = strArr;
        }
    }

    public synchronized void setSASLRealm(String str) {
        this.saslRealm = str;
    }

    public synchronized void setStartTLS(boolean z) {
        this.useStartTLS = z;
    }

    public synchronized void setUseCanonicalHostName(boolean z) {
        this.useCanonicalHostName = z;
    }

    public synchronized void setUseRset(boolean z) {
        this.useRset = z;
    }

    public synchronized int simpleCommand(String str) throws MessagingException {
        sendCommand(str);
        return readServerResponse();
    }

    public int simpleCommand(byte[] bArr) throws MessagingException {
        sendCommand(bArr);
        return readServerResponse();
    }

    public void startTLS() throws MessagingException {
        issueCommand("STARTTLS", FragmentManagerImpl.ANIM_DUR);
        try {
            this.serverSocket = SocketFetcher.startTLS(this.serverSocket, this.host, this.session.getProperties(), "mail." + this.name);
            initStreams();
        } catch (IOException e) {
            closeConnection();
            throw new MessagingException("Could not convert socket to TLS", e);
        }
    }

    public boolean supportsAuthentication(String str) {
        String str2;
        Hashtable<String, String> hashtable = this.extMap;
        if (hashtable == null || (str2 = hashtable.get("AUTH")) == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str2);
        while (stringTokenizer.hasMoreTokens()) {
            if (stringTokenizer.nextToken().equalsIgnoreCase(str)) {
                return true;
            }
        }
        if (!str.equalsIgnoreCase("LOGIN") || !supportsExtension("AUTH=LOGIN")) {
            return false;
        }
        this.logger.fine("use AUTH=LOGIN hack");
        return true;
    }

    public boolean supportsExtension(String str) {
        Hashtable<String, String> hashtable = this.extMap;
        return (hashtable == null || hashtable.get(str.toUpperCase(Locale.ENGLISH)) == null) ? false : true;
    }
}
