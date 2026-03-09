package p285z2;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* JADX INFO: renamed from: z2.qk */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C4286qk extends MenuBuilder {
    public C4286qk(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i, i2, i3, charSequence);
        C4360sk c4360sk = new C4360sk(getContext(), this, menuItemImpl);
        menuItemImpl.setSubMenu(c4360sk);
        return c4360sk;
    }
}
