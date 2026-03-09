package mobi.oneway.export.p278c;

import android.content.Context;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mobi.oneway.export.p274a.C3581a;
import mobi.oneway.export.p283g.C3635g;
import mobi.oneway.export.p283g.C3636h;
import mobi.oneway.export.p283g.C3639k;
import mobi.oneway.export.p283g.C3643o;
import mobi.oneway.export.p283g.C3647s;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.c.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3599a {

    /* JADX INFO: renamed from: a */
    private File f19657a;

    /* JADX INFO: renamed from: b */
    private ExecutorService f19658b = Executors.newFixedThreadPool(5);

    public C3599a(Context context) {
        this.f19657a = context.getDir(C3581a.f19608i, 0);
        m16720b();
    }

    /* JADX INFO: renamed from: b */
    private void m16720b() {
        File[] fileArrListFiles;
        File file = this.f19657a;
        if (file == null || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (File file2 : fileArrListFiles) {
            if (jCurrentTimeMillis - file2.lastModified() >= 604800000) {
                file2.delete();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16721a() {
        File[] fileArrListFiles;
        File file = this.f19657a;
        if (file == null || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            this.f19658b.execute(new RunnableC3600b(file2));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16722a(Throwable th) {
        if (this.f19657a == null) {
            return;
        }
        try {
            String strM16943a = C3635g.m16943a(th);
            File file = new File(this.f19657a, System.currentTimeMillis() + ".txt");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("createTime", C3647s.m17029b(new Date()));
            jSONObject.put("info", strM16943a);
            C3639k.m16982a(jSONObject, C3643o.m17000a());
            C3639k.m16982a(jSONObject, C3643o.m17001b());
            C3636h.m16957b(file, jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
