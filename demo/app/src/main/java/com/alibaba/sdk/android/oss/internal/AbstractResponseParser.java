package com.alibaba.sdk.android.oss.internal;

import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.model.OSSResult;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import p285z2.C3966hx;
import p285z2.C4299qx;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractResponseParser<T extends OSSResult> implements ResponseParser {
    private Map<String, String> parseResponseHeader(C4299qx c4299qx) {
        HashMap map = new HashMap();
        C3966hx c3966hxO00Oo0 = c4299qx.o00Oo0();
        for (int i = 0; i < c3966hxO00Oo0.OooOO0o(); i++) {
            map.put(c3966hxO00Oo0.OooO0oO(i), c3966hxO00Oo0.OooOOO(i));
        }
        return map;
    }

    public static void safeCloseResponse(C4299qx c4299qx) {
        try {
            c4299qx.OooOO0().close();
        } catch (Exception unused) {
        }
    }

    public boolean needCloseResponse() {
        return true;
    }

    @Override // com.alibaba.sdk.android.oss.internal.ResponseParser
    public T parse(C4299qx c4299qx) throws IOException {
        try {
            try {
                T t = (T) ((Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).newInstance();
                if (t != null) {
                    t.setRequestId(c4299qx.o0OoOo0(OSSHeaders.OSS_HEADER_REQUEST_ID));
                    t.setStatusCode(c4299qx.OoooooO());
                    t.setResponseHeader(parseResponseHeader(c4299qx));
                    t = (T) parseData(c4299qx, t);
                }
                return t;
            } catch (Exception e) {
                IOException iOException = new IOException(e.getMessage(), e);
                e.printStackTrace();
                OSSLog.logThrowable2Local(e);
                throw iOException;
            }
        } finally {
            if (needCloseResponse()) {
                safeCloseResponse(c4299qx);
            }
        }
    }

    public abstract T parseData(C4299qx c4299qx, T t) throws Exception;
}
