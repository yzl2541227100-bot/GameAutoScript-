package com.bumptech.glide.request.target;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p285z2.C4192o0;
import p285z2.InterfaceC4526x1;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadTarget<Z> extends SimpleTarget<Z> {
    private static final Handler HANDLER = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bumptech.glide.request.target.PreloadTarget.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((PreloadTarget) message.obj).clear();
            return true;
        }
    });
    private static final int MESSAGE_CLEAR = 1;
    private final C4192o0 requestManager;

    private PreloadTarget(C4192o0 c4192o0, int i, int i2) {
        super(i, i2);
        this.requestManager = c4192o0;
    }

    public static <Z> PreloadTarget<Z> obtain(C4192o0 c4192o0, int i, int i2) {
        return new PreloadTarget<>(c4192o0, i, i2);
    }

    public void clear() {
        this.requestManager.OooOOo(this);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(@NonNull Z z, @Nullable InterfaceC4526x1<? super Z> interfaceC4526x1) {
        HANDLER.obtainMessage(1, this).sendToTarget();
    }
}
