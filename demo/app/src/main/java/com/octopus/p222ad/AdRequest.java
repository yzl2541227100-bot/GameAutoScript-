package com.octopus.p222ad;

import android.os.Bundle;
import com.octopus.p222ad.internal.C3131q;
import com.octopus.p222ad.internal.network.AsyncTaskC3126a;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class AdRequest {
    public static final String DEVICE_ID_EMULATOR = AsyncTaskC3126a.f17369b;
    public static final int ERROR_CODE_INTERNAL_ERROR = 80001;
    public static final int ERROR_CODE_INVALID_REQUEST = 80002;
    public static final int ERROR_CODE_NETWORK_ERROR = 80003;
    public static final int ERROR_CODE_NOT_READY_TO_REQUEST = 80000;
    public static final int ERROR_CODE_NO_FILL = 80100;
    public static final int ERROR_CODE_RENDER_FAIL = 80101;
    public static final int ERROR_CODE_VIDEO_PLAY_FAIL = 80200;
    public static final int INVALID_DISPLAY = 80102;
    public static final int INVALID_MEDIA_TYPE = 80103;

    /* JADX INFO: renamed from: a */
    private final AsyncTaskC3126a.a f16651a;

    public static final class Builder {
        private final AsyncTaskC3126a.a mImpl;

        public Builder() {
            AsyncTaskC3126a.a aVar = new AsyncTaskC3126a.a();
            this.mImpl = aVar;
            aVar.m14578b(AdRequest.DEVICE_ID_EMULATOR);
        }

        public Builder addKeyword(String str) {
            this.mImpl.m14574a(str);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends Object> cls, Bundle bundle) {
            this.mImpl.m14573a(cls, bundle);
            return this;
        }

        public Builder addTestDevice(String str) {
            this.mImpl.m14578b(str);
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this);
        }

        public Builder setBirthday(Date date) {
            this.mImpl.m14575a(date);
            return this;
        }

        public Builder setContentUrl(String str) {
            C3131q.m14593a(str, (Object) "Content URL must be non-null.");
            C3131q.m14594a(str, (Object) "Content URL must be non-empty.");
            C3131q.m14596a(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.mImpl.m14581c(str);
            return this;
        }

        public Builder setGender(int i) {
            this.mImpl.m14572a(i);
            return this;
        }

        public Builder setIsDesignedForFamilies(boolean z) {
            this.mImpl.m14579b(z);
            return this;
        }

        public Builder setRequestAgent(String str) {
            this.mImpl.m14583d(str);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean z) {
            this.mImpl.m14576a(z);
            return this;
        }
    }

    private AdRequest(Builder builder) {
        this.f16651a = builder.mImpl;
    }

    public Date getBirthday() {
        return this.f16651a.m14571a();
    }

    public String getContentUrl() {
        return this.f16651a.m14577b();
    }

    public int getGender() {
        return this.f16651a.m14580c();
    }

    public Set<String> getKeywords() {
        return this.f16651a.m14582d();
    }

    public <T> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f16651a.m14570a((Class<? extends Object>) cls);
    }

    public AsyncTaskC3126a.a impl() {
        return this.f16651a;
    }
}
