package com.anythink.china.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import com.anythink.china.common.C1082d;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class TransparentActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public static final String f2333a = "type";

    /* JADX INFO: renamed from: b */
    public static final String f2334b = "request_code";

    /* JADX INFO: renamed from: c */
    public static final int f2335c = 1000;

    /* JADX INFO: renamed from: d */
    public static final String f2336d = "permission_list";

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap<Integer, C1082d.a> f2337e = new ConcurrentHashMap<>();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.getIntExtra("type", 0) == 1000) {
            ActivityCompat.requestPermissions(this, intent.getStringArrayExtra(f2336d), intent.getIntExtra(f2334b, 0));
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ConcurrentHashMap<Integer, C1082d.a> concurrentHashMap = f2337e;
        if (concurrentHashMap.get(Integer.valueOf(i)) != null) {
            concurrentHashMap.remove(Integer.valueOf(i));
        }
        finish();
    }
}
