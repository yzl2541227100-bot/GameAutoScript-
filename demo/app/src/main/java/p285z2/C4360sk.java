package p285z2;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;

/* JADX INFO: renamed from: z2.sk */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C4360sk extends SubMenuBuilder {
    public C4360sk(Context context, C4286qk c4286qk, MenuItemImpl menuItemImpl) {
        super(context, c4286qk, menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((MenuBuilder) getParentMenu()).onItemsChanged(z);
    }
}
