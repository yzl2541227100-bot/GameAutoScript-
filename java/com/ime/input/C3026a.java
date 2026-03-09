package com.ime.input;

import android.inputmethodservice.InputMethodService;
import android.view.inputmethod.InputConnection;
import p285z2.C3874ff;
import p285z2.C3912gg;

/* JADX INFO: renamed from: com.ime.input.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3026a {

    /* JADX INFO: renamed from: d */
    private static C3026a f16623d;

    /* JADX INFO: renamed from: a */
    public InputMethodService f16624a = null;

    /* JADX INFO: renamed from: b */
    public String f16625b;

    /* JADX INFO: renamed from: c */
    public String f16626c;

    private C3026a() {
    }

    /* JADX INFO: renamed from: a */
    public static C3026a m13734a() {
        if (f16623d == null) {
            f16623d = new C3026a();
        }
        return f16623d;
    }

    /* JADX INFO: renamed from: a */
    private void m13735a(InputMethodService inputMethodService) {
        new StringBuilder("settings initInputMethod ims").append(Thread.currentThread().getName());
        this.f16624a = inputMethodService;
    }

    /* JADX INFO: renamed from: a */
    private void m13736a(String str) {
        InputConnection currentInputConnection;
        InputMethodService inputMethodService = this.f16624a;
        if (inputMethodService == null || (currentInputConnection = inputMethodService.getCurrentInputConnection()) == null) {
            return;
        }
        currentInputConnection.commitText(str, str.length());
    }

    /* JADX INFO: renamed from: b */
    private void m13737b() {
        this.f16624a = null;
    }

    /* JADX INFO: renamed from: b */
    private void m13738b(String str) {
        InputMethodService inputMethodService = this.f16624a;
        if (inputMethodService != null) {
            inputMethodService.switchInputMethod(str);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m13739c(String str) {
        this.f16625b = str;
    }

    /* JADX INFO: renamed from: d */
    private void m13740d(String str) {
        this.f16626c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m13741a(boolean z) throws Throwable {
        new StringBuilder("settings cmdSwitchInput ").append(Thread.currentThread().getName());
        if (this.f16624a == null && C3874ff.OooO0O0()) {
            try {
                C3912gg.OooO00o("ime enable " + this.f16626c);
                C3912gg.OooO00o("settings put secure default_input_method ".concat(String.valueOf(z ? this.f16625b : this.f16626c)));
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
