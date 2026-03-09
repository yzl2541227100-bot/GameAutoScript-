package com.iflytek.voiceads.download.p216d;

import com.iflytek.voiceads.download.p211a.InterfaceC2924a;
import com.iflytek.voiceads.download.p217e.C2941a;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.d.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2938a implements Serializable {

    /* JADX INFO: renamed from: a */
    private InterfaceC2924a f16305a;

    /* JADX INFO: renamed from: b */
    private C2941a f16306b;

    /* JADX INFO: renamed from: c */
    private int f16307c;

    /* JADX INFO: renamed from: d */
    private String f16308d;

    /* JADX INFO: renamed from: e */
    private String f16309e;

    /* JADX INFO: renamed from: f */
    private long f16310f;

    /* JADX INFO: renamed from: g */
    private long f16311g;

    /* JADX INFO: renamed from: h */
    private int f16312h;

    /* JADX INFO: renamed from: i */
    private int f16313i;

    /* JADX INFO: renamed from: j */
    private List<C2939b> f16314j;

    /* JADX INFO: renamed from: com.iflytek.voiceads.download.d.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private String f16315a;

        /* JADX INFO: renamed from: b */
        private String f16316b;

        /* JADX INFO: renamed from: a */
        public a m13391a(String str) {
            this.f16315a = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C2938a m13392a() {
            C2938a c2938a = new C2938a();
            c2938a.m13375a(this.f16315a);
            c2938a.m13381b(this.f16316b);
            c2938a.m13379b(Math.abs(this.f16315a.hashCode()));
            return c2938a;
        }

        /* JADX INFO: renamed from: b */
        public a m13393b(String str) {
            this.f16316b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public C2941a m13370a() {
        return this.f16306b;
    }

    /* JADX INFO: renamed from: a */
    public void m13371a(int i) {
        this.f16312h = i;
    }

    /* JADX INFO: renamed from: a */
    public void m13372a(long j) {
        this.f16310f = j;
    }

    /* JADX INFO: renamed from: a */
    public void m13373a(InterfaceC2924a interfaceC2924a) {
        this.f16305a = interfaceC2924a;
    }

    /* JADX INFO: renamed from: a */
    public void m13374a(C2941a c2941a) {
        this.f16306b = c2941a;
    }

    /* JADX INFO: renamed from: a */
    public void m13375a(String str) {
        this.f16308d = str;
    }

    /* JADX INFO: renamed from: a */
    public void m13376a(List<C2939b> list) {
        this.f16314j = list;
    }

    /* JADX INFO: renamed from: a */
    public void m13377a(boolean z) {
        this.f16313i = z ? 0 : 1;
    }

    /* JADX INFO: renamed from: b */
    public String m13378b() {
        return this.f16308d;
    }

    /* JADX INFO: renamed from: b */
    public void m13379b(int i) {
        this.f16307c = i;
    }

    /* JADX INFO: renamed from: b */
    public void m13380b(long j) {
        this.f16311g = j;
    }

    /* JADX INFO: renamed from: b */
    public void m13381b(String str) {
        this.f16309e = str;
    }

    /* JADX INFO: renamed from: c */
    public String m13382c() {
        return this.f16309e;
    }

    /* JADX INFO: renamed from: d */
    public long m13383d() {
        return this.f16310f;
    }

    /* JADX INFO: renamed from: e */
    public long m13384e() {
        return this.f16311g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f16307c == ((C2938a) obj).f16307c;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC2924a m13385f() {
        return this.f16305a;
    }

    /* JADX INFO: renamed from: g */
    public int m13386g() {
        return this.f16312h;
    }

    /* JADX INFO: renamed from: h */
    public int m13387h() {
        return this.f16307c;
    }

    public int hashCode() {
        return this.f16307c;
    }

    /* JADX INFO: renamed from: i */
    public boolean m13388i() {
        return this.f16313i == 0;
    }

    /* JADX INFO: renamed from: j */
    public List<C2939b> m13389j() {
        return this.f16314j;
    }

    /* JADX INFO: renamed from: k */
    public boolean m13390k() {
        return this.f16312h == 5;
    }
}
