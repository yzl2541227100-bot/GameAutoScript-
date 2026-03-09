package com.anythink.expressad.atsignalcommon.webEnvCheck;

import com.anythink.expressad.atsignalcommon.windvane.AbstractC1471l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class WebGLCheckjs extends AbstractC1471l {
    public void webglState(Object obj, String str) {
        try {
            new JSONObject(str).optInt("webgl");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
