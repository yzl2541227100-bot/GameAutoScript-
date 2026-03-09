package com.google.zxing.multi.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p285z2.C3770cm;
import p285z2.C3807dm;
import p285z2.C3814dt;
import p285z2.C3846eo;
import p285z2.C3920go;
import p285z2.C4398tl;
import p285z2.C4439up;
import p285z2.C4516ws;
import p285z2.InterfaceC4402tp;

/* JADX INFO: loaded from: classes2.dex */
public final class QRCodeMultiReader extends C4516ws implements InterfaceC4402tp {
    private static final C3770cm[] OooO0OO = new C3770cm[0];
    private static final C3807dm[] OooO0Oo = new C3807dm[0];

    public static final class SAComparator implements Serializable, Comparator<C3770cm> {
        private SAComparator() {
        }

        @Override // java.util.Comparator
        public final int compare(C3770cm c3770cm, C3770cm c3770cm2) {
            Map<ResultMetadataType, Object> mapOooO0o0 = c3770cm.OooO0o0();
            ResultMetadataType resultMetadataType = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
            return Integer.compare(((Integer) mapOooO0o0.get(resultMetadataType)).intValue(), ((Integer) c3770cm2.OooO0o0().get(resultMetadataType)).intValue());
        }
    }

    private static List<C3770cm> OooO0oo(List<C3770cm> list) {
        boolean z;
        Iterator<C3770cm> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (it.next().OooO0o0().containsKey(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)) {
                z = true;
                break;
            }
        }
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<C3770cm> arrayList2 = new ArrayList();
        for (C3770cm c3770cm : list) {
            arrayList.add(c3770cm);
            if (c3770cm.OooO0o0().containsKey(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)) {
                arrayList2.add(c3770cm);
            }
        }
        Collections.sort(arrayList2, new SAComparator());
        StringBuilder sb = new StringBuilder();
        int length = 0;
        int length2 = 0;
        for (C3770cm c3770cm2 : arrayList2) {
            sb.append(c3770cm2.OooO0oO());
            length += c3770cm2.OooO0Oo().length;
            Map<ResultMetadataType, Object> mapOooO0o0 = c3770cm2.OooO0o0();
            ResultMetadataType resultMetadataType = ResultMetadataType.BYTE_SEGMENTS;
            if (mapOooO0o0.containsKey(resultMetadataType)) {
                Iterator it2 = ((Iterable) c3770cm2.OooO0o0().get(resultMetadataType)).iterator();
                while (it2.hasNext()) {
                    length2 += ((byte[]) it2.next()).length;
                }
            }
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length2];
        int length3 = 0;
        int length4 = 0;
        for (C3770cm c3770cm3 : arrayList2) {
            System.arraycopy(c3770cm3.OooO0Oo(), 0, bArr, length3, c3770cm3.OooO0Oo().length);
            length3 += c3770cm3.OooO0Oo().length;
            Map<ResultMetadataType, Object> mapOooO0o02 = c3770cm3.OooO0o0();
            ResultMetadataType resultMetadataType2 = ResultMetadataType.BYTE_SEGMENTS;
            if (mapOooO0o02.containsKey(resultMetadataType2)) {
                for (byte[] bArr3 : (Iterable) c3770cm3.OooO0o0().get(resultMetadataType2)) {
                    System.arraycopy(bArr3, 0, bArr2, length4, bArr3.length);
                    length4 += bArr3.length;
                }
            }
        }
        C3770cm c3770cm4 = new C3770cm(sb.toString(), bArr, OooO0Oo, BarcodeFormat.QR_CODE);
        if (length2 > 0) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(bArr2);
            c3770cm4.OooOO0(ResultMetadataType.BYTE_SEGMENTS, arrayList3);
        }
        arrayList.add(c3770cm4);
        return arrayList;
    }

    @Override // p285z2.InterfaceC4402tp
    public final C3770cm[] OooO0OO(C4398tl c4398tl) throws NotFoundException {
        return OooO0Oo(c4398tl, null);
    }

    @Override // p285z2.InterfaceC4402tp
    public final C3770cm[] OooO0Oo(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        for (C3920go c3920go : new C4439up(c4398tl.OooO0O0()).OooOOO(map)) {
            try {
                C3846eo c3846eoOooO0OO = OooO0o().OooO0OO(c3920go.OooO00o(), map);
                C3807dm[] c3807dmArrOooO0O0 = c3920go.OooO0O0();
                if (c3846eoOooO0OO.OooO0o() instanceof C3814dt) {
                    ((C3814dt) c3846eoOooO0OO.OooO0o()).OooO00o(c3807dmArrOooO0O0);
                }
                C3770cm c3770cm = new C3770cm(c3846eoOooO0OO.OooOO0(), c3846eoOooO0OO.OooO0oO(), c3807dmArrOooO0O0, BarcodeFormat.QR_CODE);
                List<byte[]> listOooO00o = c3846eoOooO0OO.OooO00o();
                if (listOooO00o != null) {
                    c3770cm.OooOO0(ResultMetadataType.BYTE_SEGMENTS, listOooO00o);
                }
                String strOooO0O0 = c3846eoOooO0OO.OooO0O0();
                if (strOooO0O0 != null) {
                    c3770cm.OooOO0(ResultMetadataType.ERROR_CORRECTION_LEVEL, strOooO0O0);
                }
                if (c3846eoOooO0OO.OooOO0O()) {
                    c3770cm.OooOO0(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c3846eoOooO0OO.OooO()));
                    c3770cm.OooOO0(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(c3846eoOooO0OO.OooO0oo()));
                }
                arrayList.add(c3770cm);
            } catch (ReaderException unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return OooO0OO;
        }
        List<C3770cm> listOooO0oo = OooO0oo(arrayList);
        return (C3770cm[]) listOooO0oo.toArray(new C3770cm[listOooO0oo.size()]);
    }
}
