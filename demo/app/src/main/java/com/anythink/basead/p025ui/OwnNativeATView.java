package com.anythink.basead.p025ui;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.anythink.basead.p015c.C0743a;
import com.anythink.basead.p025ui.guidetoclickv2.InterfaceC1020c;
import com.anythink.basead.p025ui.guidetoclickv2.InterfaceC1021d;

/* JADX INFO: loaded from: classes.dex */
public class OwnNativeATView extends FrameLayout implements InterfaceC1021d {

    /* JADX INFO: renamed from: a */
    public int f1542a;

    /* JADX INFO: renamed from: b */
    public int f1543b;

    /* JADX INFO: renamed from: c */
    public int f1544c;

    /* JADX INFO: renamed from: d */
    public int f1545d;

    /* JADX INFO: renamed from: e */
    public int f1546e;

    /* JADX INFO: renamed from: f */
    public int f1547f;

    /* JADX INFO: renamed from: g */
    public int f1548g;

    /* JADX INFO: renamed from: h */
    public int f1549h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1020c f1550i;

    /* JADX INFO: renamed from: j */
    private InterfaceC0900b f1551j;

    /* JADX INFO: renamed from: k */
    private InterfaceC0899a f1552k;

    /* JADX INFO: renamed from: com.anythink.basead.ui.OwnNativeATView$a */
    public interface InterfaceC0899a {
        /* JADX INFO: renamed from: a */
        void mo536a();

        /* JADX INFO: renamed from: b */
        void mo537b();
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.OwnNativeATView$b */
    public interface InterfaceC0900b {
        /* JADX INFO: renamed from: a */
        void m920a();
    }

    public OwnNativeATView(@NonNull Context context) {
        super(context);
    }

    public OwnNativeATView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OwnNativeATView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    private void m917a() {
        InterfaceC0899a interfaceC0899a = this.f1552k;
        if (interfaceC0899a != null) {
            interfaceC0899a.mo536a();
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m918a(MotionEvent motionEvent) {
        synchronized (this) {
            try {
                InterfaceC1020c interfaceC1020c = this.f1550i;
                if (interfaceC1020c != null) {
                    if (interfaceC1020c.mo1240a(motionEvent)) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m919b() {
        InterfaceC0899a interfaceC0899a = this.f1552k;
        if (interfaceC0899a != null) {
            interfaceC0899a.mo537b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1542a = (int) motionEvent.getRawX();
            this.f1543b = (int) motionEvent.getRawY();
            this.f1546e = (int) motionEvent.getX();
            this.f1547f = (int) motionEvent.getY();
        } else if (action == 1 || action == 3) {
            this.f1544c = (int) motionEvent.getRawX();
            this.f1545d = (int) motionEvent.getRawY();
            this.f1548g = (int) motionEvent.getX();
            this.f1549h = (int) motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C0743a getAdClickRecord() {
        C0743a c0743a = new C0743a();
        c0743a.f680a = this.f1542a;
        c0743a.f681b = this.f1543b;
        c0743a.f682c = this.f1544c;
        c0743a.f683d = this.f1545d;
        c0743a.f684e = this.f1546e;
        c0743a.f685f = this.f1547f;
        c0743a.f686g = this.f1548g;
        c0743a.f687h = this.f1549h;
        return c0743a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (m918a(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m918a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (Build.VERSION.SDK_INT >= 24) {
            if (z) {
                m917a();
            } else {
                m919b();
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (Build.VERSION.SDK_INT < 24) {
            if (i == 0) {
                m917a();
            } else {
                m919b();
            }
        }
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.InterfaceC1021d
    public void setCallback(InterfaceC1020c interfaceC1020c) {
        synchronized (this) {
            this.f1550i = interfaceC1020c;
        }
    }

    public void setLifeCallback(InterfaceC0899a interfaceC0899a) {
        this.f1552k = interfaceC0899a;
    }

    public void setWindowEventListener(InterfaceC0900b interfaceC0900b) {
        this.f1551j = interfaceC0900b;
    }
}
