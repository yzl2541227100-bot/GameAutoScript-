package p285z2;

import android.text.TextUtils;
import com.hlzn.socketclient.service.SocketService;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: z2.wt */
/* JADX INFO: loaded from: classes2.dex */
public class C4517wt {
    private final String OooO00o = C4517wt.class.getSimpleName();
    private Map<String, C4480vt> OooO0O0 = new ConcurrentHashMap();
    private SocketService OooO0OO;

    public C4517wt(SocketService socketService) {
        this.OooO0OO = socketService;
    }

    public void OooO00o(String str) {
        if (str == null || this.OooO0O0.containsKey(str)) {
            return;
        }
        this.OooO0O0.put(str, new C4480vt(this.OooO0OO, str));
    }

    public void OooO0O0(String str) {
        C4480vt c4480vtRemove;
        if (TextUtils.isEmpty(str) || (c4480vtRemove = this.OooO0O0.remove(str)) == null) {
            return;
        }
        c4480vtRemove.cancel();
    }

    public synchronized void OooO0OO() {
        Iterator<Map.Entry<String, C4480vt>> it = this.OooO0O0.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cancel();
        }
    }
}
