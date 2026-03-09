package com.ime.input;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.KeyboardView;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes2.dex */
public class InputKb extends InputMethodService {

    /* JADX INFO: renamed from: b */
    public static Handler f16620b;

    /* JADX INFO: renamed from: a */
    public EditorInfo f16621a;

    /* JADX INFO: renamed from: c */
    private KeyboardView f16622c;

    @Override // android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.i("InputKb", "InputKb - onCreate()");
        C3026a c3026aM13734a = C3026a.m13734a();
        new StringBuilder("settings initInputMethod ims").append(Thread.currentThread().getName());
        c3026aM13734a.f16624a = this;
    }

    @Override // android.inputmethodservice.InputMethodService
    public View onCreateInputView() {
        return this.f16622c;
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.i("InputKb", "InputKb - onDestroy()");
        C3026a.m13734a().f16624a = null;
    }

    @Override // android.inputmethodservice.InputMethodService
    public boolean onEvaluateFullscreenMode() {
        EditorInfo editorInfo;
        if (getResources().getConfiguration().orientation == 2 && (editorInfo = this.f16621a) != null && (editorInfo.imeOptions & 268435456) != 0) {
        }
        return false;
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onFinishInputView(boolean z) {
        super.onFinishInputView(z);
    }
}
