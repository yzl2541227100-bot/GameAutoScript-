package cn.haorui.sdk.core.loader.cache;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public enum CacheManager {
    INSTANCE;

    private static final String TAG = "CacheManager";
    private final ConcurrentHashMap<String, List<WeakReference<C0499a>>> cacheMap = new ConcurrentHashMap<>();

    CacheManager() {
    }

    private int getMaxMemory() {
        return (int) Runtime.getRuntime().maxMemory();
    }

    private int getTraceMemory() {
        return (int) (Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
    }

    public void clear() {
        this.cacheMap.clear();
    }

    public synchronized List<WeakReference<C0499a>> getCacheListByKey(String str) {
        List<WeakReference<C0499a>> list;
        try {
            list = this.cacheMap.get(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (list == null) {
            return null;
        }
        if (list.size() > 0) {
            return list;
        }
        return null;
    }

    public synchronized C0499a getFirstEntity(String str) {
        try {
            if (this.cacheMap.get(str) != null && this.cacheMap.get(str).size() > 0) {
                C0499a c0499a = this.cacheMap.get(str).get(0).get();
                if (c0499a != null && c0499a.m38a()) {
                    return c0499a;
                }
                removeFirstEntity(str);
            }
        } catch (Exception unused) {
            remove(str);
        }
        return null;
    }

    public synchronized void handleCurrentList(String str, List<C0499a> list, int i) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    List<WeakReference<C0499a>> cacheListByKey = getCacheListByKey(str);
                    if (cacheListByKey != null && cacheListByKey.size() > 0) {
                        Iterator<WeakReference<C0499a>> it = cacheListByKey.iterator();
                        while (it.hasNext()) {
                            C0499a c0499a = it.next().get();
                            if (c0499a != null && c0499a.m38a()) {
                                list.add(c0499a);
                            }
                        }
                    }
                    Collections.sort(list);
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < i && list.size() > i2; i2++) {
                        arrayList.add(new WeakReference(list.get(i2)));
                    }
                    remove(str);
                    put(str, arrayList);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void put(String str, List<WeakReference<C0499a>> list) {
        if (str != null) {
            if (list != null) {
                try {
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (getTraceMemory() < getMaxMemory() / 5) {
                    clear();
                } else {
                    this.cacheMap.put(str, list);
                }
            }
        }
    }

    public void remove(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.cacheMap.remove(str);
    }

    public synchronized void removeFirstEntity(String str) {
        List<WeakReference<C0499a>> list = this.cacheMap.get(str);
        if (list != null && list.size() > 0) {
            list.remove(0);
        }
    }
}
