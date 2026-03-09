package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ColorStateListInflaterCompat {
    private static final int DEFAULT_COLOR = -65536;

    private ColorStateListInflaterCompat() {
    }

    @NonNull
    public static ColorStateList createFromXml(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return createFromXmlInner(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    public static ColorStateList createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return inflate(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[PHI: r12
  0x004f: PHI (r12v3 int) = (r12v0 int), (r12v1 int) binds: [B:16:0x004d, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.ColorStateList inflate(@androidx.annotation.NonNull android.content.res.Resources r17, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r18, @androidx.annotation.NonNull android.util.AttributeSet r19, @androidx.annotation.Nullable android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r19
            int r1 = r18.getDepth()
            r2 = 1
            int r1 = r1 + r2
            r3 = 20
            int[][] r4 = new int[r3][]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = 0
        L10:
            int r7 = r18.next()
            if (r7 == r2) goto Lad
            int r8 = r18.getDepth()
            if (r8 >= r1) goto L1f
            r9 = 3
            if (r7 == r9) goto Lad
        L1f:
            r9 = 2
            if (r7 != r9) goto La6
            if (r8 > r1) goto La6
            java.lang.String r7 = r18.getName()
            java.lang.String r8 = "item"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L32
            goto La6
        L32:
            int[] r7 = androidx.core.C0135R.styleable.ColorStateListItem
            r8 = r17
            r9 = r20
            android.content.res.TypedArray r7 = obtainAttributes(r8, r9, r0, r7)
            int r10 = androidx.core.C0135R.styleable.ColorStateListItem_android_color
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r7.getColor(r10, r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = androidx.core.C0135R.styleable.ColorStateListItem_android_alpha
            boolean r13 = r7.hasValue(r12)
            if (r13 == 0) goto L54
        L4f:
            float r11 = r7.getFloat(r12, r11)
            goto L5d
        L54:
            int r12 = androidx.core.C0135R.styleable.ColorStateListItem_alpha
            boolean r13 = r7.hasValue(r12)
            if (r13 == 0) goto L5d
            goto L4f
        L5d:
            r7.recycle()
            int r7 = r19.getAttributeCount()
            int[] r12 = new int[r7]
            r13 = 0
            r14 = 0
        L68:
            if (r13 >= r7) goto L8d
            int r15 = r0.getAttributeNameResource(r13)
            r2 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r2) goto L89
            r2 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r2) goto L89
            int r2 = androidx.core.C0135R.attr.alpha
            if (r15 == r2) goto L89
            int r2 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r13, r5)
            if (r16 == 0) goto L85
            goto L86
        L85:
            int r15 = -r15
        L86:
            r12[r14] = r15
            r14 = r2
        L89:
            int r13 = r13 + 1
            r2 = 1
            goto L68
        L8d:
            int[] r2 = android.util.StateSet.trimStateSet(r12, r14)
            int r7 = modulateColorAlpha(r10, r11)
            if (r6 == 0) goto L98
            int r10 = r2.length
        L98:
            int[] r3 = androidx.core.content.res.GrowingArrayUtils.append(r3, r6, r7)
            java.lang.Object[] r2 = androidx.core.content.res.GrowingArrayUtils.append(r4, r6, r2)
            r4 = r2
            int[][] r4 = (int[][]) r4
            int r6 = r6 + 1
            goto Laa
        La6:
            r8 = r17
            r9 = r20
        Laa:
            r2 = 1
            goto L10
        Lad:
            int[] r0 = new int[r6]
            int[][] r1 = new int[r6][]
            java.lang.System.arraycopy(r3, r5, r0, r5, r6)
            java.lang.System.arraycopy(r4, r5, r1, r5, r6)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ColorStateListInflaterCompat.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    @ColorInt
    private static int modulateColorAlpha(@ColorInt int i, @FloatRange(from = 0.0d, m0to = 1.0d) float f) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (Math.round(Color.alpha(i) * f) << 24);
    }

    private static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
