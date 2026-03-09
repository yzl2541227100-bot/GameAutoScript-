package com.anythink.expressad.exoplayer.scheduler;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public final class PlatformScheduler implements InterfaceC1762c {

    /* JADX INFO: renamed from: b */
    private static final String f10030b = "PlatformScheduler";

    /* JADX INFO: renamed from: c */
    private static final String f10031c = "service_action";

    /* JADX INFO: renamed from: d */
    private static final String f10032d = "service_package";

    /* JADX INFO: renamed from: e */
    private static final String f10033e = "requirements";

    /* JADX INFO: renamed from: f */
    private final int f10034f;

    /* JADX INFO: renamed from: g */
    private final ComponentName f10035g;

    /* JADX INFO: renamed from: h */
    private final JobScheduler f10036h;

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            if (!new C1760a(extras.getInt(PlatformScheduler.f10033e)).m8484a(this)) {
                jobFinished(jobParameters, true);
                return false;
            }
            String string = extras.getString(PlatformScheduler.f10031c);
            String string2 = extras.getString(PlatformScheduler.f10032d);
            Intent intent = new Intent(string).setPackage(string2);
            StringBuilder sb = new StringBuilder("Starting service action: ");
            sb.append(string);
            sb.append(" package: ");
            sb.append(string2);
            C1717af.m8061a((Context) this, intent);
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    private PlatformScheduler(Context context, int i) {
        this.f10034f = i;
        this.f10035g = new ComponentName(context, (Class<?>) PlatformSchedulerService.class);
        this.f10036h = (JobScheduler) context.getSystemService("jobscheduler");
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    private static JobInfo m8472a(int i, ComponentName componentName, C1760a c1760a, String str, String str2) {
        JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
        int iM8483a = c1760a.m8483a();
        int i2 = 4;
        if (iM8483a == 0) {
            i2 = 0;
        } else if (iM8483a == 1) {
            i2 = 1;
        } else if (iM8483a == 2) {
            i2 = 2;
        } else if (iM8483a != 3) {
            if (iM8483a != 4) {
                throw new UnsupportedOperationException();
            }
            if (C1717af.f9627a < 26) {
                throw new UnsupportedOperationException();
            }
        } else {
            if (C1717af.f9627a < 24) {
                throw new UnsupportedOperationException();
            }
            i2 = 3;
        }
        builder.setRequiredNetworkType(i2);
        builder.setRequiresDeviceIdle(c1760a.m8486c());
        builder.setRequiresCharging(c1760a.m8485b());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f10031c, str);
        persistableBundle.putString(f10032d, str2);
        persistableBundle.putInt(f10033e, c1760a.m8487d());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    /* JADX INFO: renamed from: b */
    private static void m8473b() {
    }

    /* JADX INFO: renamed from: c */
    private static /* synthetic */ void m8474c() {
    }

    @Override // com.anythink.expressad.exoplayer.scheduler.InterfaceC1762c
    /* JADX INFO: renamed from: a */
    public final boolean mo8475a() {
        new StringBuilder("Canceling job: ").append(this.f10034f);
        this.f10036h.cancel(this.f10034f);
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.scheduler.InterfaceC1762c
    /* JADX INFO: renamed from: a */
    public final boolean mo8476a(C1760a c1760a, String str, String str2) {
        JobInfo.Builder builder = new JobInfo.Builder(this.f10034f, this.f10035g);
        int iM8483a = c1760a.m8483a();
        int i = 4;
        if (iM8483a == 0) {
            i = 0;
        } else if (iM8483a == 1) {
            i = 1;
        } else if (iM8483a == 2) {
            i = 2;
        } else if (iM8483a != 3) {
            if (iM8483a != 4) {
                throw new UnsupportedOperationException();
            }
            if (C1717af.f9627a < 26) {
                throw new UnsupportedOperationException();
            }
        } else {
            if (C1717af.f9627a < 24) {
                throw new UnsupportedOperationException();
            }
            i = 3;
        }
        builder.setRequiredNetworkType(i);
        builder.setRequiresDeviceIdle(c1760a.m8486c());
        builder.setRequiresCharging(c1760a.m8485b());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f10031c, str2);
        persistableBundle.putString(f10032d, str);
        persistableBundle.putInt(f10033e, c1760a.m8487d());
        builder.setExtras(persistableBundle);
        int iSchedule = this.f10036h.schedule(builder.build());
        StringBuilder sb = new StringBuilder("Scheduling job: ");
        sb.append(this.f10034f);
        sb.append(" result: ");
        sb.append(iSchedule);
        return iSchedule == 1;
    }
}
