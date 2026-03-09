package com.anythink.expressad.exoplayer.p097g.p100c;

import com.anythink.expressad.exoplayer.p097g.C1582a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.c.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1600b implements C1582a.a {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
