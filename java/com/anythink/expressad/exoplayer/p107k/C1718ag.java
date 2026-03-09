package com.anythink.expressad.exoplayer.p107k;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.ag */
/* JADX INFO: loaded from: classes.dex */
public final class C1718ag {
    private C1718ag() {
    }

    /* JADX INFO: renamed from: a */
    private static String m8126a(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m8127a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m8128a(XmlPullParser xmlPullParser, String str) {
        return (xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m8129b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m8130b(XmlPullParser xmlPullParser, String str) {
        return m8129b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: c */
    private static boolean m8131c(XmlPullParser xmlPullParser, String str) {
        return m8129b(xmlPullParser) && m8126a(xmlPullParser.getName()).equals(str);
    }

    /* JADX INFO: renamed from: d */
    private static String m8132d(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private static String m8133e(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m8126a(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
