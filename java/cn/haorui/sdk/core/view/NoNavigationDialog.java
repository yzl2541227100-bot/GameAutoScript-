package cn.haorui.sdk.core.view;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class NoNavigationDialog extends AlertDialog {
    private Window window;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.view.NoNavigationDialog$a */
    public class ViewOnSystemUiVisibilityChangeListenerC0583a implements View.OnSystemUiVisibilityChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Window f287a;

        public ViewOnSystemUiVisibilityChangeListenerC0583a(NoNavigationDialog noNavigationDialog, Window window) {
            this.f287a = window;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            this.f287a.getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? 5894 : 1799);
        }
    }

    public NoNavigationDialog(Context context) {
        super(context);
        this.window = getWindow();
    }

    public NoNavigationDialog(@NonNull Context context, int i) {
        super(context, i);
    }

    private void clearFocusNotAle(Window window) {
        window.clearFlags(8);
    }

    private void focusNotAle(Window window) {
        window.setFlags(8, 8);
    }

    public void hideNavigationBar(Window window) {
        window.getDecorView().setSystemUiVisibility(2);
        window.getDecorView().setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC0583a(this, window));
    }

    @Override // android.app.Dialog
    public void show() {
        focusNotAle(this.window);
        super.show();
        hideNavigationBar(this.window);
        clearFocusNotAle(this.window);
    }
}
