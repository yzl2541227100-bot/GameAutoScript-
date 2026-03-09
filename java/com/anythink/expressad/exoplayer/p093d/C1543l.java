package com.anythink.expressad.exoplayer.p093d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaDrm;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1541j;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.l */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(23)
public final class C1543l implements InterfaceC1541j<C1542k> {

    /* JADX INFO: renamed from: g */
    private static final String f8015g = "cenc";

    /* JADX INFO: renamed from: h */
    private final UUID f8016h;

    /* JADX INFO: renamed from: i */
    private final MediaDrm f8017i;

    @SuppressLint({"WrongConstant"})
    private C1543l(UUID uuid) {
        C1711a.m8005a(uuid);
        UUID uuid2 = C1500b.f7469bi;
        C1711a.m8011a(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        if (C1717af.f9627a < 27 && C1500b.f7470bj.equals(uuid)) {
            uuid = uuid2;
        }
        this.f8016h = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.f8017i = mediaDrm;
        if (C1500b.f7471bk.equals(uuid) && "ASUS_Z00AD".equals(C1717af.f9630d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1543l m6803a(UUID uuid) throws C1546o {
        try {
            return new C1543l(uuid);
        } catch (Exception e) {
            throw new C1546o(e);
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m6804d() {
        return "ASUS_Z00AD".equals(C1717af.f9630d);
    }

    /* JADX INFO: renamed from: e */
    private C1542k m6805e(byte[] bArr) {
        return new C1542k(new MediaCrypto(this.f8016h, bArr), C1717af.f9627a < 21 && C1500b.f7471bk.equals(this.f8016h) && "L3".equals(mo6780a("securityLevel")));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.anythink.expressad.exoplayer.p093d.InterfaceC1541j.d mo6779a(byte[] r9, byte[] r10, java.lang.String r11, int r12, java.util.HashMap<java.lang.String, java.lang.String> r13) throws android.media.NotProvisionedException {
        /*
            r8 = this;
            int r0 = com.anythink.expressad.exoplayer.p107k.C1717af.f9627a
            r1 = 21
            if (r0 >= r1) goto L10
            java.util.UUID r1 = com.anythink.expressad.exoplayer.C1500b.f7471bk
            java.util.UUID r2 = r8.f8016h
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3e
        L10:
            java.util.UUID r1 = com.anythink.expressad.exoplayer.C1500b.f7472bl
            java.util.UUID r2 = r8.f8016h
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            java.lang.String r1 = com.anythink.expressad.exoplayer.p107k.C1717af.f9629c
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L48
            java.lang.String r1 = com.anythink.expressad.exoplayer.p107k.C1717af.f9630d
            java.lang.String r2 = "AFTB"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L3e
            java.lang.String r2 = "AFTS"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L3e
            java.lang.String r2 = "AFTM"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L48
        L3e:
            java.util.UUID r1 = r8.f8016h
            byte[] r1 = com.anythink.expressad.exoplayer.p094e.p095a.C1557h.m6938a(r10, r1)
            if (r1 == 0) goto L48
            r4 = r1
            goto L49
        L48:
            r4 = r10
        L49:
            r10 = 26
            if (r0 >= r10) goto L69
            java.util.UUID r10 = com.anythink.expressad.exoplayer.C1500b.f7470bj
            java.util.UUID r1 = r8.f8016h
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L69
            java.lang.String r10 = "video/mp4"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L67
            java.lang.String r10 = "audio/mp4"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L69
        L67:
            java.lang.String r11 = "cenc"
        L69:
            r5 = r11
            android.media.MediaDrm r2 = r8.f8017i
            r3 = r9
            r6 = r12
            r7 = r13
            android.media.MediaDrm$KeyRequest r9 = r2.getKeyRequest(r3, r4, r5, r6, r7)
            byte[] r10 = r9.getData()
            java.util.UUID r11 = com.anythink.expressad.exoplayer.C1500b.f7470bj
            java.util.UUID r12 = r8.f8016h
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L9e
            r11 = 27
            if (r0 < r11) goto L86
            goto L9e
        L86:
            java.lang.String r10 = com.anythink.expressad.exoplayer.p107k.C1717af.m8068a(r10)
            r11 = 43
            r12 = 45
            java.lang.String r10 = r10.replace(r11, r12)
            r11 = 47
            r12 = 95
            java.lang.String r10 = r10.replace(r11, r12)
            byte[] r10 = com.anythink.expressad.exoplayer.p107k.C1717af.m8107c(r10)
        L9e:
            com.anythink.expressad.exoplayer.d.j$a r11 = new com.anythink.expressad.exoplayer.d.j$a
            java.lang.String r9 = r9.getDefaultUrl()
            r11.<init>(r10, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p093d.C1543l.mo6779a(byte[], byte[], java.lang.String, int, java.util.HashMap):com.anythink.expressad.exoplayer.d.j$d");
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: a */
    public final String mo6780a(String str) {
        return this.f8017i.getPropertyString(str);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: a */
    public final void mo6781a(final InterfaceC1541j.f<? super C1542k> fVar) {
        this.f8017i.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.anythink.expressad.exoplayer.d.l.1
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(@NonNull MediaDrm mediaDrm, @Nullable byte[] bArr, int i, int i2, byte[] bArr2) {
                fVar.mo6763a(bArr, i);
            }
        });
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: a */
    public final void mo6782a(final InterfaceC1541j.g<? super C1542k> gVar) {
        if (C1717af.f9627a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f8017i.setOnKeyStatusChangeListener(gVar == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: com.anythink.expressad.exoplayer.d.l.2
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(@NonNull MediaDrm mediaDrm, @NonNull byte[] bArr, @NonNull List<MediaDrm.KeyStatus> list, boolean z) {
                ArrayList arrayList = new ArrayList();
                for (MediaDrm.KeyStatus keyStatus : list) {
                    arrayList.add(new InterfaceC1541j.b(keyStatus.getStatusCode(), keyStatus.getKeyId()));
                }
            }
        }, (Handler) null);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: a */
    public final void mo6783a(String str, String str2) {
        this.f8017i.setPropertyString(str, str2);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: a */
    public final void mo6784a(String str, byte[] bArr) {
        this.f8017i.setPropertyByteArray(str, bArr);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: a */
    public final void mo6785a(byte[] bArr) {
        this.f8017i.closeSession(bArr);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: a */
    public final byte[] mo6786a() {
        return this.f8017i.openSession();
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: a */
    public final byte[] mo6787a(byte[] bArr, byte[] bArr2) {
        if (C1500b.f7470bj.equals(this.f8016h)) {
            bArr2 = C1532a.m6702a(bArr2);
        }
        return this.f8017i.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: b */
    public final InterfaceC1541j.h mo6788b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f8017i.getProvisionRequest();
        return new InterfaceC1541j.c(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: b */
    public final void mo6789b(byte[] bArr) throws DeniedByServerException {
        this.f8017i.provideProvisionResponse(bArr);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: b */
    public final void mo6790b(byte[] bArr, byte[] bArr2) {
        this.f8017i.restoreKeys(bArr, bArr2);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: b */
    public final byte[] mo6791b(String str) {
        return this.f8017i.getPropertyByteArray(str);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo6792c(byte[] bArr) {
        return this.f8017i.queryKeyStatus(bArr);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: c */
    public final void mo6793c() {
        this.f8017i.release();
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1540i mo6794d(byte[] bArr) {
        return new C1542k(new MediaCrypto(this.f8016h, bArr), C1717af.f9627a < 21 && C1500b.f7471bk.equals(this.f8016h) && "L3".equals(mo6780a("securityLevel")));
    }
}
