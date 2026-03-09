package com.sun.mail.util.logging;

import com.anythink.expressad.foundation.p120g.C1801a;
import com.umeng.commonsdk.proguard.C3471v;
import java.util.Date;
import java.util.Formattable;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import javax.mail.UIDFolder;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes2.dex */
public class CompactFormatter extends Formatter {
    private final String fmt;

    public class Alternate implements Formattable {
        private final String left;
        private final String right;

        public Alternate(String str, String str2) {
            this.left = String.valueOf(str);
            this.right = String.valueOf(str2);
        }

        private int minCodePointCount(String str, int i) {
            int length = str.length();
            return length - i >= i ? i : Math.min(str.codePointCount(0, length), i);
        }

        private String pad(int i, String str, int i2) {
            StringBuilder sb = new StringBuilder(Math.max(str.length() + i2, i2));
            int i3 = 0;
            if ((i & 1) == 1) {
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append(str);
            } else {
                sb.append(str);
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
            }
            return sb.toString();
        }

        @Override // java.util.Formattable
        public void formatTo(java.util.Formatter formatter, int i, int i2, int i3) {
            int iMinCodePointCount;
            int iMinCodePointCount2;
            String strPad = this.left;
            String strPad2 = this.right;
            if ((i & 2) == 2) {
                strPad = strPad.toUpperCase(formatter.locale());
                strPad2 = strPad2.toUpperCase(formatter.locale());
            }
            if ((i & 4) == 4) {
                strPad = CompactFormatter.this.toAlternate(strPad);
                strPad2 = CompactFormatter.this.toAlternate(strPad2);
            }
            if (i3 >= 0) {
                iMinCodePointCount = minCodePointCount(strPad, i3);
                int iMinCodePointCount3 = minCodePointCount(strPad2, i3);
                if (iMinCodePointCount > (i3 >> 1)) {
                    iMinCodePointCount = Math.max(iMinCodePointCount - iMinCodePointCount3, iMinCodePointCount >> 1);
                }
                iMinCodePointCount2 = Math.min(i3 - iMinCodePointCount, iMinCodePointCount3);
                strPad = strPad.substring(0, strPad.offsetByCodePoints(0, iMinCodePointCount));
                strPad2 = strPad2.substring(0, strPad2.offsetByCodePoints(0, iMinCodePointCount2));
            } else {
                iMinCodePointCount = 0;
                iMinCodePointCount2 = 0;
            }
            if (i2 > 0) {
                if (i3 < 0) {
                    iMinCodePointCount = minCodePointCount(strPad, i2);
                    iMinCodePointCount2 = minCodePointCount(strPad2, i2);
                }
                int i4 = i2 >> 1;
                if (iMinCodePointCount < i4) {
                    strPad = pad(i, strPad, i4 - iMinCodePointCount);
                }
                if (iMinCodePointCount2 < i4) {
                    strPad2 = pad(i, strPad2, i4 - iMinCodePointCount2);
                }
            }
            formatter.format(strPad, new Object[0]);
            if (!strPad.isEmpty() && !strPad2.isEmpty()) {
                formatter.format(C1801a.f11059bQ, new Object[0]);
            }
            formatter.format(strPad2, new Object[0]);
        }
    }

    static {
        loadDeclaredClasses();
    }

    public CompactFormatter() {
        this.fmt = initFormat(getClass().getName());
    }

    public CompactFormatter(String str) {
        this.fmt = str == null ? initFormat(getClass().getName()) : str;
    }

    private boolean defaultIgnore(StackTraceElement stackTraceElement) {
        return isSynthetic(stackTraceElement) || isStaticUtility(stackTraceElement) || isReflection(stackTraceElement);
    }

    private String findAndFormat(StackTraceElement[] stackTraceElementArr) {
        String stackTraceElement;
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = "";
                break;
            }
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i];
            if (!ignore(stackTraceElement2)) {
                stackTraceElement = formatStackTraceElement(stackTraceElement2);
                break;
            }
            i++;
        }
        if (!isNullOrSpaces(stackTraceElement)) {
            return stackTraceElement;
        }
        for (StackTraceElement stackTraceElement3 : stackTraceElementArr) {
            if (!defaultIgnore(stackTraceElement3)) {
                return formatStackTraceElement(stackTraceElement3);
            }
        }
        return stackTraceElement;
    }

    private String formatStackTraceElement(StackTraceElement stackTraceElement) {
        String strReplace = stackTraceElement.toString().replace(stackTraceElement.getClassName(), simpleClassName(stackTraceElement.getClassName()));
        String strSimpleFileName = simpleFileName(stackTraceElement.getFileName());
        return (strSimpleFileName == null || !strReplace.startsWith(strSimpleFileName)) ? strReplace : strReplace.replace(stackTraceElement.getFileName(), "");
    }

    private Comparable<?> formatZonedDateTime(LogRecord logRecord) {
        Comparable<?> zonedDateTime = LogManagerProperties.getZonedDateTime(logRecord);
        return zonedDateTime == null ? new Date(logRecord.getMillis()) : zonedDateTime;
    }

    private String initFormat(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".format"));
        return isNullOrSpaces(strFromLogManager) ? "%7$#.160s%n" : strFromLogManager;
    }

    private static boolean isNullOrSpaces(String str) {
        return str == null || str.trim().isEmpty();
    }

    private boolean isReflection(StackTraceElement stackTraceElement) {
        try {
            return LogManagerProperties.isReflectionClass(stackTraceElement.getClassName());
        } catch (RuntimeException | Exception | LinkageError unused) {
            return stackTraceElement.getClassName().startsWith("java.lang.reflect.") || stackTraceElement.getClassName().startsWith("sun.reflect.");
        }
    }

    private boolean isStaticUtility(StackTraceElement stackTraceElement) {
        try {
            return LogManagerProperties.isStaticUtilityClass(stackTraceElement.getClassName());
        } catch (RuntimeException | Exception | LinkageError unused) {
            String className = stackTraceElement.getClassName();
            return (className.endsWith(C3471v.f18958al) && !className.endsWith("es")) || className.contains("Util") || className.endsWith("Throwables");
        }
    }

    private boolean isSynthetic(StackTraceElement stackTraceElement) {
        return stackTraceElement.getMethodName().indexOf(36) >= 0;
    }

    private boolean isUnknown(StackTraceElement stackTraceElement) {
        return stackTraceElement.getLineNumber() < 0;
    }

    private static Class<?>[] loadDeclaredClasses() {
        return new Class[]{Alternate.class};
    }

    private static String replaceClassName(String str, Throwable th) {
        if (!isNullOrSpaces(str)) {
            int i = 0;
            while (th != null) {
                Class<?> cls = th.getClass();
                str = str.replace(cls.getName(), simpleClassName(cls));
                i++;
                if (i == 65536) {
                    break;
                }
                th = th.getCause();
            }
        }
        return str;
    }

    private static String replaceClassName(String str, Object[] objArr) {
        if (!isNullOrSpaces(str) && objArr != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    Class<?> cls = obj.getClass();
                    str = str.replace(cls.getName(), simpleClassName(cls));
                }
            }
        }
        return str;
    }

    private static String simpleClassName(Class<?> cls) {
        try {
            return cls.getSimpleName();
        } catch (InternalError unused) {
            return simpleClassName(cls.getName());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r1 < 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r1 >= r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r3 >= r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r3 <= r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        return r6.substring(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String simpleClassName(java.lang.String r6) {
        /*
            if (r6 == 0) goto L46
            r0 = 0
            r1 = -1
            r2 = -1
            r3 = -1
        L6:
            int r4 = r6.length()
            if (r0 >= r4) goto L35
            int r4 = r6.codePointAt(r0)
            boolean r5 = java.lang.Character.isJavaIdentifierPart(r4)
            if (r5 != 0) goto L2a
            r5 = 46
            if (r4 != r5) goto L24
            int r2 = r1 + 1
            if (r2 == r0) goto L23
            if (r2 == r3) goto L23
            r2 = r1
            r1 = r0
            goto L2f
        L23:
            return r6
        L24:
            int r4 = r1 + 1
            if (r4 != r0) goto L35
            r1 = r2
            goto L35
        L2a:
            r5 = 36
            if (r4 != r5) goto L2f
            r3 = r0
        L2f:
            int r4 = java.lang.Character.charCount(r4)
            int r0 = r0 + r4
            goto L6
        L35:
            if (r1 < 0) goto L46
            int r1 = r1 + 1
            if (r1 >= r0) goto L46
            int r3 = r3 + 1
            if (r3 >= r0) goto L46
            if (r3 <= r1) goto L42
            r1 = r3
        L42:
            java.lang.String r6 = r6.substring(r1)
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.CompactFormatter.simpleClassName(java.lang.String):java.lang.String");
    }

    private static String simpleFileName(String str) {
        int iLastIndexOf;
        return (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0) ? str : str.substring(0, iLastIndexOf);
    }

    public Throwable apply(Throwable th) {
        return SeverityComparator.getInstance().apply(th);
    }

    @Override // java.util.logging.Formatter
    public String format(LogRecord logRecord) {
        ResourceBundle resourceBundle = logRecord.getResourceBundle();
        Locale locale = resourceBundle == null ? null : resourceBundle.getLocale();
        String message = formatMessage(logRecord);
        String thrown = formatThrown(logRecord);
        String error = formatError(logRecord);
        Object[] objArr = {formatZonedDateTime(logRecord), formatSource(logRecord), formatLoggerName(logRecord), formatLevel(logRecord), message, thrown, new Alternate(message, thrown), new Alternate(thrown, message), Long.valueOf(logRecord.getSequenceNumber()), formatThreadID(logRecord), error, new Alternate(message, error), new Alternate(error, message), formatBackTrace(logRecord), logRecord.getResourceBundleName(), logRecord.getMessage()};
        String str = this.fmt;
        return locale == null ? String.format(str, objArr) : String.format(locale, str, objArr);
    }

    public String formatBackTrace(LogRecord logRecord) {
        Throwable thrown = logRecord.getThrown();
        if (thrown == null) {
            return "";
        }
        StackTraceElement[] stackTrace = apply(thrown).getStackTrace();
        String strFindAndFormat = findAndFormat(stackTrace);
        if (!isNullOrSpaces(strFindAndFormat)) {
            return strFindAndFormat;
        }
        int i = 0;
        while (thrown != null) {
            StackTraceElement[] stackTrace2 = thrown.getStackTrace();
            String strFindAndFormat2 = findAndFormat(stackTrace2);
            if (isNullOrSpaces(strFindAndFormat2)) {
                if (stackTrace.length == 0) {
                    stackTrace = stackTrace2;
                }
                i++;
                if (i != 65536) {
                    thrown = thrown.getCause();
                    strFindAndFormat = strFindAndFormat2;
                }
            }
            strFindAndFormat = strFindAndFormat2;
            break;
        }
        return (!isNullOrSpaces(strFindAndFormat) || stackTrace.length == 0) ? strFindAndFormat : formatStackTraceElement(stackTrace[0]);
    }

    public String formatError(LogRecord logRecord) {
        return formatMessage(logRecord.getThrown());
    }

    public String formatLevel(LogRecord logRecord) {
        return logRecord.getLevel().getLocalizedName();
    }

    public String formatLoggerName(LogRecord logRecord) {
        return simpleClassName(logRecord.getLoggerName());
    }

    public String formatMessage(Throwable th) {
        String strSimpleClassName;
        String strReplaceClassName;
        if (th == null) {
            return "";
        }
        Throwable thApply = apply(th);
        String localizedMessage = thApply.getLocalizedMessage();
        String string = thApply.toString();
        String strSimpleClassName2 = simpleClassName(thApply.getClass());
        if (isNullOrSpaces(localizedMessage)) {
            strSimpleClassName = simpleClassName(string);
            strReplaceClassName = replaceClassName(strSimpleClassName, th);
        } else if (string.contains(localizedMessage)) {
            if (string.startsWith(thApply.getClass().getName()) || string.startsWith(strSimpleClassName2)) {
                strReplaceClassName = replaceClassName(localizedMessage, th);
            }
            strSimpleClassName = simpleClassName(string);
            strReplaceClassName = replaceClassName(strSimpleClassName, th);
        } else {
            strSimpleClassName = simpleClassName(string) + ": " + localizedMessage;
            strReplaceClassName = replaceClassName(strSimpleClassName, th);
        }
        if (strReplaceClassName.contains(strSimpleClassName2)) {
            return strReplaceClassName;
        }
        return strSimpleClassName2 + ": " + strReplaceClassName;
    }

    @Override // java.util.logging.Formatter
    public String formatMessage(LogRecord logRecord) {
        return replaceClassName(replaceClassName(super.formatMessage(logRecord), logRecord.getThrown()), logRecord.getParameters());
    }

    public String formatSource(LogRecord logRecord) {
        String sourceClassName = logRecord.getSourceClassName();
        if (sourceClassName == null) {
            return simpleClassName(logRecord.getLoggerName());
        }
        if (logRecord.getSourceMethodName() == null) {
            return simpleClassName(sourceClassName);
        }
        return simpleClassName(sourceClassName) + C4196o4.OooO00o.OooO0Oo + logRecord.getSourceMethodName();
    }

    public Number formatThreadID(LogRecord logRecord) {
        Long longThreadID = LogManagerProperties.getLongThreadID(logRecord);
        return longThreadID == null ? Long.valueOf(((long) logRecord.getThreadID()) & UIDFolder.MAXUID) : longThreadID;
    }

    public String formatThrown(LogRecord logRecord) {
        Throwable thrown = logRecord.getThrown();
        if (thrown == null) {
            return "";
        }
        String backTrace = formatBackTrace(logRecord);
        StringBuilder sb = new StringBuilder();
        sb.append(formatMessage(thrown));
        sb.append(isNullOrSpaces(backTrace) ? "" : C4196o4.OooO00o.OooO0Oo.concat(String.valueOf(backTrace)));
        return sb.toString();
    }

    public boolean ignore(StackTraceElement stackTraceElement) {
        return isUnknown(stackTraceElement) || defaultIgnore(stackTraceElement);
    }

    public String toAlternate(String str) {
        if (str != null) {
            return str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
        }
        return null;
    }
}
