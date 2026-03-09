package javax.activation;

import com.sun.activation.registries.LogSupport;
import com.sun.activation.registries.MailcapFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MailcapCommandMap extends CommandMap {
    private static final int PROG = 0;
    private static final String confDir;

    /* JADX INFO: renamed from: DB */
    private MailcapFile[] f19521DB;

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: javax.activation.MailcapCommandMap.1
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

    public MailcapCommandMap() throws Throwable {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(null);
        LogSupport.log("MailcapCommandMap: load HOME");
        try {
            String property = System.getProperty("user.home");
            if (property != null) {
                MailcapFile mailcapFileLoadFile = loadFile(property + File.separator + ".mailcap");
                if (mailcapFileLoadFile != null) {
                    arrayList.add(mailcapFileLoadFile);
                }
            }
        } catch (SecurityException unused) {
        }
        LogSupport.log("MailcapCommandMap: load SYS");
        try {
            String str = confDir;
            if (str != null) {
                MailcapFile mailcapFileLoadFile2 = loadFile(str + "mailcap");
                if (mailcapFileLoadFile2 != null) {
                    arrayList.add(mailcapFileLoadFile2);
                }
            }
        } catch (SecurityException unused2) {
        }
        LogSupport.log("MailcapCommandMap: load JAR");
        loadAllResources(arrayList, "META-INF/mailcap");
        LogSupport.log("MailcapCommandMap: load DEF");
        MailcapFile mailcapFileLoadResource = loadResource("/META-INF/mailcap.default");
        if (mailcapFileLoadResource != null) {
            arrayList.add(mailcapFileLoadResource);
        }
        MailcapFile[] mailcapFileArr = new MailcapFile[arrayList.size()];
        this.f19521DB = mailcapFileArr;
        this.f19521DB = (MailcapFile[]) arrayList.toArray(mailcapFileArr);
    }

    public MailcapCommandMap(InputStream inputStream) {
        this();
        LogSupport.log("MailcapCommandMap: load PROG");
        MailcapFile[] mailcapFileArr = this.f19521DB;
        if (mailcapFileArr[0] == null) {
            try {
                mailcapFileArr[0] = new MailcapFile(inputStream);
            } catch (IOException unused) {
            }
        }
    }

    public MailcapCommandMap(String str) throws IOException {
        this();
        if (LogSupport.isLoggable()) {
            LogSupport.log("MailcapCommandMap: load PROG from ".concat(String.valueOf(str)));
        }
        MailcapFile[] mailcapFileArr = this.f19521DB;
        if (mailcapFileArr[0] == null) {
            mailcapFileArr[0] = new MailcapFile(str);
        }
    }

    private void appendCmdsToList(Map map, List list) {
        for (String str : map.keySet()) {
            Iterator it = ((List) map.get(str)).iterator();
            while (it.hasNext()) {
                list.add(new CommandInfo(str, (String) it.next()));
            }
        }
    }

    private void appendPrefCmdsToList(Map map, List list) {
        for (String str : map.keySet()) {
            if (!checkForVerb(list, str)) {
                list.add(new CommandInfo(str, (String) ((List) map.get(str)).get(0)));
            }
        }
    }

    private boolean checkForVerb(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((CommandInfo) it.next()).getCommandName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private DataContentHandler getDataContentHandler(String str) {
        Class<?> cls;
        if (LogSupport.isLoggable()) {
            LogSupport.log("    got content-handler");
        }
        if (LogSupport.isLoggable()) {
            LogSupport.log("      class ".concat(String.valueOf(str)));
        }
        try {
            ClassLoader contextClassLoader = SecuritySupport.getContextClassLoader();
            if (contextClassLoader == null) {
                contextClassLoader = getClass().getClassLoader();
            }
            try {
                cls = contextClassLoader.loadClass(str);
            } catch (Exception unused) {
                cls = Class.forName(str);
            }
            if (cls != null) {
                return (DataContentHandler) cls.newInstance();
            }
            return null;
        } catch (ClassNotFoundException e) {
            e = e;
            if (!LogSupport.isLoggable()) {
                return null;
            }
            LogSupport.log("Can't load DCH ".concat(String.valueOf(str)), e);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            if (!LogSupport.isLoggable()) {
                return null;
            }
            LogSupport.log("Can't load DCH ".concat(String.valueOf(str)), e);
            return null;
        } catch (InstantiationException e3) {
            e = e3;
            if (!LogSupport.isLoggable()) {
                return null;
            }
            LogSupport.log("Can't load DCH ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    private void loadAllResources(List list, String str) throws Throwable {
        int i = 0;
        try {
            ClassLoader contextClassLoader = SecuritySupport.getContextClassLoader();
            if (contextClassLoader == null) {
                contextClassLoader = getClass().getClassLoader();
            }
            URL[] resources = contextClassLoader != null ? SecuritySupport.getResources(contextClassLoader, str) : SecuritySupport.getSystemResources(str);
            if (resources != null) {
                if (LogSupport.isLoggable()) {
                    LogSupport.log("MailcapCommandMap: getResources");
                }
                int i2 = 0;
                while (i < resources.length) {
                    try {
                        URL url = resources[i];
                        InputStream inputStreamOpenStream = null;
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("MailcapCommandMap: URL ".concat(String.valueOf(url)));
                        }
                        try {
                            try {
                                inputStreamOpenStream = SecuritySupport.openStream(url);
                                if (inputStreamOpenStream != null) {
                                    list.add(new MailcapFile(inputStreamOpenStream));
                                    try {
                                        if (LogSupport.isLoggable()) {
                                            LogSupport.log("MailcapCommandMap: successfully loaded mailcap file from URL: ".concat(String.valueOf(url)));
                                        }
                                        i2 = 1;
                                    } catch (IOException e) {
                                        e = e;
                                        i2 = 1;
                                        if (LogSupport.isLoggable()) {
                                            LogSupport.log("MailcapCommandMap: can't load ".concat(String.valueOf(url)), e);
                                        }
                                        if (inputStreamOpenStream != null) {
                                        }
                                        i++;
                                    } catch (SecurityException e2) {
                                        e = e2;
                                        i2 = 1;
                                        if (LogSupport.isLoggable()) {
                                            LogSupport.log("MailcapCommandMap: can't load ".concat(String.valueOf(url)), e);
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
                                    LogSupport.log("MailcapCommandMap: not loading mailcap file from URL: ".concat(String.valueOf(url)));
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
                            LogSupport.log("MailcapCommandMap: can't load ".concat(String.valueOf(str)), e);
                        }
                    }
                }
                i = i2;
            }
        } catch (Exception e6) {
            e = e6;
        }
        if (i == 0) {
            if (LogSupport.isLoggable()) {
                LogSupport.log("MailcapCommandMap: !anyLoaded");
            }
            MailcapFile mailcapFileLoadResource = loadResource("/".concat(String.valueOf(str)));
            if (mailcapFileLoadResource != null) {
                list.add(mailcapFileLoadResource);
            }
        }
    }

    private MailcapFile loadFile(String str) {
        try {
            return new MailcapFile(str);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0078: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:39:0x0078 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0040 A[EXC_TOP_SPLITTER, PHI: r2
  0x0040: PHI (r2v5 java.io.InputStream) = (r2v3 java.io.InputStream), (r2v4 java.io.InputStream), (r2v7 java.io.InputStream) binds: [B:29:0x005f, B:35:0x0073, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.sun.activation.registries.MailcapFile loadResource(java.lang.String r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "MailcapCommandMap: can't load "
            r1 = 0
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L48 java.lang.SecurityException -> L4a java.io.IOException -> L60
            java.io.InputStream r2 = javax.activation.SecuritySupport.getResourceAsStream(r2, r7)     // Catch: java.lang.Throwable -> L48 java.lang.SecurityException -> L4a java.io.IOException -> L60
            if (r2 == 0) goto L2b
            com.sun.activation.registries.MailcapFile r3 = new com.sun.activation.registries.MailcapFile     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
            r3.<init>(r2)     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
            boolean r4 = com.sun.activation.registries.LogSupport.isLoggable()     // Catch: java.lang.SecurityException -> L44 java.io.IOException -> L46 java.lang.Throwable -> L77
            if (r4 == 0) goto L25
            java.lang.String r4 = "MailcapCommandMap: successfully loaded mailcap file: "
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
            java.lang.String r3 = "MailcapCommandMap: not loading mailcap file: "
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
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.MailcapCommandMap.loadResource(java.lang.String):com.sun.activation.registries.MailcapFile");
    }

    public synchronized void addMailcap(String str) {
        LogSupport.log("MailcapCommandMap: add to PROG");
        MailcapFile[] mailcapFileArr = this.f19521DB;
        if (mailcapFileArr[0] == null) {
            mailcapFileArr[0] = new MailcapFile();
        }
        this.f19521DB[0].appendToMailcap(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        r2 = r4.f19521DB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r1 >= r2.length) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r2[r1] == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (com.sun.activation.registries.LogSupport.isLoggable() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        com.sun.activation.registries.LogSupport.log("  search fallback DB #".concat(java.lang.String.valueOf(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r2 = r4.f19521DB[r1].getMailcapFallbackList(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        r2 = (java.util.List) r2.get("content-handler");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r2 = getDataContentHandler((java.lang.String) r2.get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (r2 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        return null;
     */
    @Override // javax.activation.CommandMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized javax.activation.DataContentHandler createDataContentHandler(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = com.sun.activation.registries.LogSupport.isLoggable()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L14
            java.lang.String r0 = "MailcapCommandMap: createDataContentHandler for "
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> La4
            com.sun.activation.registries.LogSupport.log(r0)     // Catch: java.lang.Throwable -> La4
        L14:
            if (r5 == 0) goto L1c
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> La4
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch: java.lang.Throwable -> La4
        L1c:
            r0 = 0
            r1 = 0
        L1e:
            com.sun.activation.registries.MailcapFile[] r2 = r4.f19521DB     // Catch: java.lang.Throwable -> La4
            int r3 = r2.length     // Catch: java.lang.Throwable -> La4
            if (r1 >= r3) goto L5f
            r2 = r2[r1]     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L5c
            boolean r2 = com.sun.activation.registries.LogSupport.isLoggable()     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L3a
            java.lang.String r2 = "  search DB #"
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> La4
            com.sun.activation.registries.LogSupport.log(r2)     // Catch: java.lang.Throwable -> La4
        L3a:
            com.sun.activation.registries.MailcapFile[] r2 = r4.f19521DB     // Catch: java.lang.Throwable -> La4
            r2 = r2[r1]     // Catch: java.lang.Throwable -> La4
            java.util.Map r2 = r2.getMailcapList(r5)     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L5c
            java.lang.String r3 = "content-handler"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La4
            javax.activation.DataContentHandler r2 = r4.getDataContentHandler(r2)     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L5c
            monitor-exit(r4)
            return r2
        L5c:
            int r1 = r1 + 1
            goto L1e
        L5f:
            r1 = 0
        L60:
            com.sun.activation.registries.MailcapFile[] r2 = r4.f19521DB     // Catch: java.lang.Throwable -> La4
            int r3 = r2.length     // Catch: java.lang.Throwable -> La4
            if (r1 >= r3) goto La1
            r2 = r2[r1]     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L9e
            boolean r2 = com.sun.activation.registries.LogSupport.isLoggable()     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L7c
            java.lang.String r2 = "  search fallback DB #"
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> La4
            com.sun.activation.registries.LogSupport.log(r2)     // Catch: java.lang.Throwable -> La4
        L7c:
            com.sun.activation.registries.MailcapFile[] r2 = r4.f19521DB     // Catch: java.lang.Throwable -> La4
            r2 = r2[r1]     // Catch: java.lang.Throwable -> La4
            java.util.Map r2 = r2.getMailcapFallbackList(r5)     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L9e
            java.lang.String r3 = "content-handler"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La4
            javax.activation.DataContentHandler r2 = r4.getDataContentHandler(r2)     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L9e
            monitor-exit(r4)
            return r2
        L9e:
            int r1 = r1 + 1
            goto L60
        La1:
            r5 = 0
            monitor-exit(r4)
            return r5
        La4:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.MailcapCommandMap.createDataContentHandler(java.lang.String):javax.activation.DataContentHandler");
    }

    @Override // javax.activation.CommandMap
    public synchronized CommandInfo[] getAllCommands(String str) {
        ArrayList arrayList;
        Map mailcapFallbackList;
        Map mailcapList;
        arrayList = new ArrayList();
        if (str != null) {
            str = str.toLowerCase(Locale.ENGLISH);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            MailcapFile[] mailcapFileArr = this.f19521DB;
            if (i2 >= mailcapFileArr.length) {
                break;
            }
            if (mailcapFileArr[i2] != null && (mailcapList = mailcapFileArr[i2].getMailcapList(str)) != null) {
                appendCmdsToList(mailcapList, arrayList);
            }
            i2++;
        }
        while (true) {
            MailcapFile[] mailcapFileArr2 = this.f19521DB;
            if (i < mailcapFileArr2.length) {
                if (mailcapFileArr2[i] != null && (mailcapFallbackList = mailcapFileArr2[i].getMailcapFallbackList(str)) != null) {
                    appendCmdsToList(mailcapFallbackList, arrayList);
                }
                i++;
            }
        }
        return (CommandInfo[]) arrayList.toArray(new CommandInfo[arrayList.size()]);
    }

    @Override // javax.activation.CommandMap
    public synchronized CommandInfo getCommand(String str, String str2) {
        Map mailcapFallbackList;
        List list;
        String str3;
        Map mailcapList;
        List list2;
        String str4;
        if (str != null) {
            try {
                str = str.toLowerCase(Locale.ENGLISH);
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = 0;
        while (true) {
            MailcapFile[] mailcapFileArr = this.f19521DB;
            if (i >= mailcapFileArr.length) {
                int i2 = 0;
                while (true) {
                    MailcapFile[] mailcapFileArr2 = this.f19521DB;
                    if (i2 >= mailcapFileArr2.length) {
                        return null;
                    }
                    if (mailcapFileArr2[i2] != null && (mailcapFallbackList = mailcapFileArr2[i2].getMailcapFallbackList(str)) != null && (list = (List) mailcapFallbackList.get(str2)) != null && (str3 = (String) list.get(0)) != null) {
                        return new CommandInfo(str2, str3);
                    }
                    i2++;
                }
            } else {
                if (mailcapFileArr[i] != null && (mailcapList = mailcapFileArr[i].getMailcapList(str)) != null && (list2 = (List) mailcapList.get(str2)) != null && (str4 = (String) list2.get(0)) != null) {
                    return new CommandInfo(str2, str4);
                }
                i++;
            }
        }
    }

    @Override // javax.activation.CommandMap
    public synchronized String[] getMimeTypes() {
        ArrayList arrayList;
        String[] mimeTypes;
        arrayList = new ArrayList();
        int i = 0;
        while (true) {
            MailcapFile[] mailcapFileArr = this.f19521DB;
            if (i < mailcapFileArr.length) {
                if (mailcapFileArr[i] != null && (mimeTypes = mailcapFileArr[i].getMimeTypes()) != null) {
                    for (int i2 = 0; i2 < mimeTypes.length; i2++) {
                        if (!arrayList.contains(mimeTypes[i2])) {
                            arrayList.add(mimeTypes[i2]);
                        }
                    }
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public synchronized String[] getNativeCommands(String str) {
        ArrayList arrayList;
        String[] nativeCommands;
        arrayList = new ArrayList();
        if (str != null) {
            str = str.toLowerCase(Locale.ENGLISH);
        }
        int i = 0;
        while (true) {
            MailcapFile[] mailcapFileArr = this.f19521DB;
            if (i < mailcapFileArr.length) {
                if (mailcapFileArr[i] != null && (nativeCommands = mailcapFileArr[i].getNativeCommands(str)) != null) {
                    for (int i2 = 0; i2 < nativeCommands.length; i2++) {
                        if (!arrayList.contains(nativeCommands[i2])) {
                            arrayList.add(nativeCommands[i2]);
                        }
                    }
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // javax.activation.CommandMap
    public synchronized CommandInfo[] getPreferredCommands(String str) {
        ArrayList arrayList;
        Map mailcapFallbackList;
        Map mailcapList;
        arrayList = new ArrayList();
        if (str != null) {
            str = str.toLowerCase(Locale.ENGLISH);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            MailcapFile[] mailcapFileArr = this.f19521DB;
            if (i2 >= mailcapFileArr.length) {
                break;
            }
            if (mailcapFileArr[i2] != null && (mailcapList = mailcapFileArr[i2].getMailcapList(str)) != null) {
                appendPrefCmdsToList(mailcapList, arrayList);
            }
            i2++;
        }
        while (true) {
            MailcapFile[] mailcapFileArr2 = this.f19521DB;
            if (i < mailcapFileArr2.length) {
                if (mailcapFileArr2[i] != null && (mailcapFallbackList = mailcapFileArr2[i].getMailcapFallbackList(str)) != null) {
                    appendPrefCmdsToList(mailcapFallbackList, arrayList);
                }
                i++;
            }
        }
        return (CommandInfo[]) arrayList.toArray(new CommandInfo[arrayList.size()]);
    }
}
