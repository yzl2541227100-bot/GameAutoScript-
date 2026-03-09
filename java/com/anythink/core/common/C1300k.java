package com.anythink.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: com.anythink.core.common.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1300k {

    /* JADX INFO: renamed from: a */
    public static final int f4923a = 1;

    /* JADX INFO: renamed from: b */
    private static final String f4924b = "InnerBroadcastManager";

    /* JADX INFO: renamed from: c */
    private static final boolean f4925c = false;

    /* JADX INFO: renamed from: i */
    private static final Object f4926i = new Object();

    /* JADX INFO: renamed from: j */
    private static C1300k f4927j;

    /* JADX INFO: renamed from: d */
    private final Context f4928d;

    /* JADX INFO: renamed from: e */
    private final HashMap<BroadcastReceiver, ArrayList<b>> f4929e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    private final HashMap<String, ArrayList<b>> f4930f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    private final ArrayList<a> f4931g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    private final Handler f4932h;

    /* JADX INFO: renamed from: com.anythink.core.common.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Intent f4934a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<b> f4935b;

        public a(Intent intent, ArrayList<b> arrayList) {
            this.f4934a = intent;
            this.f4935b = arrayList;
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.k$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final IntentFilter f4936a;

        /* JADX INFO: renamed from: b */
        public final BroadcastReceiver f4937b;

        /* JADX INFO: renamed from: c */
        public boolean f4938c;

        /* JADX INFO: renamed from: d */
        public boolean f4939d;

        public b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f4936a = intentFilter;
            this.f4937b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f4937b);
            sb.append(" filter=");
            sb.append(this.f4936a);
            if (this.f4939d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C1300k(Context context) {
        this.f4928d = context;
        this.f4932h = new Handler(context.getMainLooper()) { // from class: com.anythink.core.common.k.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    C1300k.this.m3743a();
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static C1300k m3741a(Context context) {
        C1300k c1300k;
        synchronized (f4926i) {
            if (f4927j == null) {
                f4927j = new C1300k(context.getApplicationContext());
            }
            c1300k = f4927j;
        }
        return c1300k;
    }

    /* JADX INFO: renamed from: b */
    private void m3742b(Intent intent) {
        if (m3746a(intent)) {
            m3743a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3743a() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (this.f4929e) {
                size = this.f4931g.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                this.f4931g.toArray(aVarArr);
                this.f4931g.clear();
            }
            for (int i = 0; i < size; i++) {
                a aVar = aVarArr[i];
                int size2 = aVar.f4935b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b bVar = aVar.f4935b.get(i2);
                    if (!bVar.f4939d) {
                        bVar.f4937b.onReceive(this.f4928d, aVar.f4934a);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3744a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f4929e) {
            ArrayList<b> arrayListRemove = this.f4929e.remove(broadcastReceiver);
            if (arrayListRemove != null) {
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    b bVar = arrayListRemove.get(size);
                    bVar.f4939d = true;
                    for (int i = 0; i < bVar.f4936a.countActions(); i++) {
                        String action = bVar.f4936a.getAction(i);
                        ArrayList<b> arrayList = this.f4930f.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                b bVar2 = arrayList.get(size2);
                                if (bVar2.f4937b == broadcastReceiver) {
                                    bVar2.f4939d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f4930f.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3745a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f4929e) {
            b bVar = new b(intentFilter, broadcastReceiver);
            ArrayList<b> arrayList = this.f4929e.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f4929e.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<b> arrayList2 = this.f4930f.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f4930f.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3746a(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<b> arrayList2;
        String str2;
        synchronized (this.f4929e) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f4928d.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<b> arrayList3 = this.f4930f.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: ".concat(String.valueOf(arrayList3)));
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    b bVar = arrayList3.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f4936a);
                    }
                    if (bVar.f4938c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int iMatch = bVar.f4936a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(bVar);
                            bVar.f4938c = true;
                            i2 = i + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        } else if (z) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: ".concat(iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : NativeAdvancedJsUtils.f6629p : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((b) arrayList5.get(i3)).f4938c = false;
                    }
                    this.f4931g.add(new a(intent, arrayList5));
                    if (!this.f4932h.hasMessages(1)) {
                        this.f4932h.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
