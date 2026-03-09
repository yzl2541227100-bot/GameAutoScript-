package javax.activation;

import com.sun.activation.registries.LogSupport;
import com.sun.activation.registries.MimeTypeFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class MimetypesFileTypeMap extends FileTypeMap {
    private static final int PROG = 0;
    private static final String confDir;
    private static final String defaultType = "application/octet-stream";

    /* JADX INFO: renamed from: DB */
    private MimeTypeFile[] f19522DB;

    /* JADX INFO: renamed from: javax.activation.MimetypesFileTypeMap$1 */
    public class C35491 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Object run() {
            String property = System.getProperty("java.home");
            StringBuilder sb = new StringBuilder();
            sb.append(property);
            String str = File.separator;
            sb.append(str);
            sb.append("conf");
            String string = sb.toString();
            if (new File(string).exists()) {
                return string + str;
            }
            return property + str + "lib" + str;
        }
    }

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: javax.activation.MimetypesFileTypeMap.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    String property = System.getProperty("java.home");
                    StringBuilder sb = new StringBuilder();
                    sb.append(property);
                    String str2 = File.separator;
                    sb.append(str2);
                    sb.append("conf");
                    String string = sb.toString();
                    if (new File(string).exists()) {
                        return string + str2;
                    }
                    return property + str2 + "lib" + str2;
                }
            });
        } catch (Exception unused) {
            str = null;
        }
        confDir = str;
    }

    public MimetypesFileTypeMap() throws Throwable {
        Vector vector = new Vector(5);
        vector.addElement(null);
        LogSupport.log("MimetypesFileTypeMap: load HOME");
        try {
            String property = System.getProperty("user.home");
            if (property != null) {
                MimeTypeFile mimeTypeFileLoadFile = loadFile(property + File.separator + ".mime.types");
                if (mimeTypeFileLoadFile != null) {
                    vector.addElement(mimeTypeFileLoadFile);
                }
            }
        } catch (SecurityException unused) {
        }
        LogSupport.log("MimetypesFileTypeMap: load SYS");
        try {
            String str = confDir;
            if (str != null) {
                MimeTypeFile mimeTypeFileLoadFile2 = loadFile(str + "mime.types");
                if (mimeTypeFileLoadFile2 != null) {
                    vector.addElement(mimeTypeFileLoadFile2);
                }
            }
        } catch (SecurityException unused2) {
        }
        LogSupport.log("MimetypesFileTypeMap: load JAR");
        loadAllResources(vector, "META-INF/mime.types");
        LogSupport.log("MimetypesFileTypeMap: load DEF");
        MimeTypeFile mimeTypeFileLoadResource = loadResource("/META-INF/mimetypes.default");
        if (mimeTypeFileLoadResource != null) {
            vector.addElement(mimeTypeFileLoadResource);
        }
        MimeTypeFile[] mimeTypeFileArr = new MimeTypeFile[vector.size()];
        this.f19522DB = mimeTypeFileArr;
        vector.copyInto(mimeTypeFileArr);
    }

    public MimetypesFileTypeMap(InputStream inputStream) {
        this();
        try {
            this.f19522DB[0] = new MimeTypeFile(inputStream);
        } catch (IOException unused) {
        }
    }

    public MimetypesFileTypeMap(String str) throws IOException {
        this();
        this.f19522DB[0] = new MimeTypeFile(str);
    }

    private void loadAllResources(Vector vector, String str) throws Throwable {
        int i = 0;
        try {
            ClassLoader contextClassLoader = SecuritySupport.getContextClassLoader();
            if (contextClassLoader == null) {
                contextClassLoader = getClass().getClassLoader();
            }
            URL[] resources = contextClassLoader != null ? SecuritySupport.getResources(contextClassLoader, str) : SecuritySupport.getSystemResources(str);
            if (resources != null) {
                if (LogSupport.isLoggable()) {
                    LogSupport.log("MimetypesFileTypeMap: getResources");
                }
                int i2 = 0;
                while (i < resources.length) {
                    try {
                        URL url = resources[i];
                        InputStream inputStreamOpenStream = null;
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("MimetypesFileTypeMap: URL ".concat(String.valueOf(url)));
                        }
                        try {
                            try {
                                inputStreamOpenStream = SecuritySupport.openStream(url);
                                if (inputStreamOpenStream != null) {
                                    vector.addElement(new MimeTypeFile(inputStreamOpenStream));
                                    try {
                                        if (LogSupport.isLoggable()) {
                                            LogSupport.log("MimetypesFileTypeMap: successfully loaded mime types from URL: ".concat(String.valueOf(url)));
                                        }
                                        i2 = 1;
                                    } catch (IOException e) {
                                        e = e;
                                        i2 = 1;
                                        if (LogSupport.isLoggable()) {
                                            LogSupport.log("MimetypesFileTypeMap: can't load ".concat(String.valueOf(url)), e);
                                        }
                                        if (inputStreamOpenStream != null) {
                                        }
                                        i++;
                                    } catch (SecurityException e2) {
                                        e = e2;
                                        i2 = 1;
                                        if (LogSupport.isLoggable()) {
                                            LogSupport.log("MimetypesFileTypeMap: can't load ".concat(String.valueOf(url)), e);
                                        }
                                        if (inputStreamOpenStream == null) {
                                            i++;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        i2 = 1;
                                        if (inputStreamOpenStream != null) {
                                            try {
                                                inputStreamOpenStream.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        throw th;
                                    }
                                } else if (LogSupport.isLoggable()) {
                                    LogSupport.log("MimetypesFileTypeMap: not loading mime types from URL: ".concat(String.valueOf(url)));
                                }
                            } catch (IOException e3) {
                                e = e3;
                            } catch (SecurityException e4) {
                                e = e4;
                            }
                            if (inputStreamOpenStream != null) {
                                try {
                                    inputStreamOpenStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            i++;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i = i2;
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("MimetypesFileTypeMap: can't load ".concat(String.valueOf(str)), e);
                        }
                    }
                }
                i = i2;
            }
        } catch (Exception e6) {
            e = e6;
        }
        if (i == 0) {
            LogSupport.log("MimetypesFileTypeMap: !anyLoaded");
            MimeTypeFile mimeTypeFileLoadResource = loadResource("/".concat(String.valueOf(str)));
            if (mimeTypeFileLoadResource != null) {
                vector.addElement(mimeTypeFileLoadResource);
            }
        }
    }

    private MimeTypeFile loadFile(String str) {
        try {
            return new MimeTypeFile(str);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0078: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:94:0x0078 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0040 A[EXC_TOP_SPLITTER, PHI: r2
  0x0040: PHI (r2v5 java.io.InputStream) = (r2v3 java.io.InputStream), (r2v4 java.io.InputStream), (r2v7 java.io.InputStream) binds: [B:84:0x005f, B:90:0x0073, B:69:0x003e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.sun.activation.registries.MimeTypeFile loadResource(java.lang.String r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "MimetypesFileTypeMap: can't load "
            r1 = 0
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L48 java.lang.SecurityException -> L4a java.io.IOException -> L60
            java.io.InputStream r2 = javax.activation.SecuritySupport.getResourceAsStream(r2, r7)     // Catch: java.lang.Throwable -> L48 java.lang.SecurityException -> L4a java.io.IOException -> L60
            if (r2 == 0) goto L2b
            com.sun.activation.registries.MimeTypeFile r3 = new com.sun.activation.registries.MimeTypeFile     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
            r3.<init>(r2)     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
            boolean r4 = com.sun.activation.registries.LogSupport.isLoggable()     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
            if (r4 == 0) goto L25
            java.lang.String r4 = "MimetypesFileTypeMap: successfully loaded mime types file: "
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
            com.sun.activation.registries.LogSupport.log(r4)     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
        L25:
            if (r2 == 0) goto L2a
            r2.close()     // Catch: java.io.IOException -> L2a
        L2a:
            return r3
        L2b:
            boolean r3 = com.sun.activation.registries.LogSupport.isLoggable()     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
            if (r3 == 0) goto L3e
            java.lang.String r3 = "MimetypesFileTypeMap: not loading mime types file: "
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
            com.sun.activation.registries.LogSupport.log(r3)     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
        L3e:
            if (r2 == 0) goto L76
        L40:
            r2.close()     // Catch: java.io.IOException -> L76
            goto L76
        L44:
            r3 = move-exception
            goto L4c
        L46:
            r3 = move-exception
            goto L62
        L48:
            r7 = move-exception
            goto L79
        L4a:
            r3 = move-exception
            r2 = r1
        L4c:
            boolean r4 = com.sun.activation.registries.LogSupport.isLoggable()     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L5d
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = r0.concat(r7)     // Catch: java.lang.Throwable -> L77
            com.sun.activation.registries.LogSupport.log(r7, r3)     // Catch: java.lang.Throwable -> L77
        L5d:
            if (r2 == 0) goto L76
            goto L40
        L60:
            r3 = move-exception
            r2 = r1
        L62:
            boolean r4 = com.sun.activation.registries.LogSupport.isLoggable()     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L73
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = r0.concat(r7)     // Catch: java.lang.Throwable -> L77
            com.sun.activation.registries.LogSupport.log(r7, r3)     // Catch: java.lang.Throwable -> L77
        L73:
            if (r2 == 0) goto L76
            goto L40
        L76:
            return r1
        L77:
            r7 = move-exception
            r1 = r2
        L79:
            if (r1 == 0) goto L7e
            r1.close()     // Catch: java.io.IOException -> L7e
        L7e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.MimetypesFileTypeMap.loadResource(java.lang.String):com.sun.activation.registries.MimeTypeFile");
    }

    public synchronized void addMimeTypes(String str) {
        MimeTypeFile[] mimeTypeFileArr = this.f19522DB;
        if (mimeTypeFileArr[0] == null) {
            mimeTypeFileArr[0] = new MimeTypeFile();
        }
        this.f19522DB[0].appendToRegistry(str);
    }

    @Override // javax.activation.FileTypeMap
    public String getContentType(File file) {
        return getContentType(file.getName());
    }

    @Override // javax.activation.FileTypeMap
    public synchronized String getContentType(String str) {
        String mIMETypeString;
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (strSubstring.length() == 0) {
            return "application/octet-stream";
        }
        int i = 0;
        while (true) {
            MimeTypeFile[] mimeTypeFileArr = this.f19522DB;
            if (i >= mimeTypeFileArr.length) {
                return "application/octet-stream";
            }
            if (mimeTypeFileArr[i] != null && (mIMETypeString = mimeTypeFileArr[i].getMIMETypeString(strSubstring)) != null) {
                return mIMETypeString;
            }
            i++;
        }
    }
}
