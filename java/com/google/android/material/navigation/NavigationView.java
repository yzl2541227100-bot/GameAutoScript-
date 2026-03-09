package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0032R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C2754R;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import p285z2.C4286qk;
import p285z2.C4323rk;
import p285z2.C4471vk;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] Oooooo = {R.attr.state_checked};
    private static final int[] OoooooO = {-16842910};
    private static final int Ooooooo = 1;
    private final C4286qk Ooooo0o;
    private final C4323rk OooooO0;
    public OooO0O0 OooooOO;
    private final int OooooOo;
    private MenuInflater Oooooo0;

    public class OooO00o implements MenuBuilder.Callback {
        public OooO00o() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            OooO0O0 oooO0O0 = NavigationView.this.OooooOO;
            return oooO0O0 != null && oooO0O0.OooO00o(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
        }
    }

    public interface OooO0O0 {
        boolean OooO00o(@NonNull MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public Bundle menuState;

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2754R.attr.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        boolean z;
        super(context, attributeSet, i);
        C4323rk c4323rk = new C4323rk();
        this.OooooO0 = c4323rk;
        C4286qk c4286qk = new C4286qk(context);
        this.Ooooo0o = c4286qk;
        TintTypedArray tintTypedArrayOooOO0O = C4471vk.OooOO0O(context, attributeSet, C2754R.styleable.NavigationView, i, C2754R.style.Widget_Design_NavigationView, new int[0]);
        ViewCompat.setBackground(this, tintTypedArrayOooOO0O.getDrawable(C2754R.styleable.NavigationView_android_background));
        if (tintTypedArrayOooOO0O.hasValue(C2754R.styleable.NavigationView_elevation)) {
            ViewCompat.setElevation(this, tintTypedArrayOooOO0O.getDimensionPixelSize(r13, 0));
        }
        ViewCompat.setFitsSystemWindows(this, tintTypedArrayOooOO0O.getBoolean(C2754R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.OooooOo = tintTypedArrayOooOO0O.getDimensionPixelSize(C2754R.styleable.NavigationView_android_maxWidth, 0);
        int i2 = C2754R.styleable.NavigationView_itemIconTint;
        ColorStateList colorStateList = tintTypedArrayOooOO0O.hasValue(i2) ? tintTypedArrayOooOO0O.getColorStateList(i2) : OooO0OO(R.attr.textColorSecondary);
        int i3 = C2754R.styleable.NavigationView_itemTextAppearance;
        if (tintTypedArrayOooOO0O.hasValue(i3)) {
            resourceId = tintTypedArrayOooOO0O.getResourceId(i3, 0);
            z = true;
        } else {
            resourceId = 0;
            z = false;
        }
        int i4 = C2754R.styleable.NavigationView_itemTextColor;
        ColorStateList colorStateList2 = tintTypedArrayOooOO0O.hasValue(i4) ? tintTypedArrayOooOO0O.getColorStateList(i4) : null;
        if (!z && colorStateList2 == null) {
            colorStateList2 = OooO0OO(R.attr.textColorPrimary);
        }
        Drawable drawable = tintTypedArrayOooOO0O.getDrawable(C2754R.styleable.NavigationView_itemBackground);
        int i5 = C2754R.styleable.NavigationView_itemHorizontalPadding;
        if (tintTypedArrayOooOO0O.hasValue(i5)) {
            c4323rk.OooOOOo(tintTypedArrayOooOO0O.getDimensionPixelSize(i5, 0));
        }
        int dimensionPixelSize = tintTypedArrayOooOO0O.getDimensionPixelSize(C2754R.styleable.NavigationView_itemIconPadding, 0);
        c4286qk.setCallback(new OooO00o());
        c4323rk.OooOOO(1);
        c4323rk.initForMenu(context, c4286qk);
        c4323rk.OooOOo(colorStateList);
        if (z) {
            c4323rk.OooOOoo(resourceId);
        }
        c4323rk.OooOo00(colorStateList2);
        c4323rk.OooOOOO(drawable);
        c4323rk.OooOOo0(dimensionPixelSize);
        c4286qk.addMenuPresenter(c4323rk);
        addView((View) c4323rk.getMenuView(this));
        int i6 = C2754R.styleable.NavigationView_menu;
        if (tintTypedArrayOooOO0O.hasValue(i6)) {
            OooO0o(tintTypedArrayOooOO0O.getResourceId(i6, 0));
        }
        int i7 = C2754R.styleable.NavigationView_headerLayout;
        if (tintTypedArrayOooOO0O.hasValue(i7)) {
            OooO0o0(tintTypedArrayOooOO0O.getResourceId(i7, 0));
        }
        tintTypedArrayOooOO0O.recycle();
    }

    private ColorStateList OooO0OO(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0032R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = OoooooO;
        return new ColorStateList(new int[][]{iArr, Oooooo, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.Oooooo0 == null) {
            this.Oooooo0 = new SupportMenuInflater(getContext());
        }
        return this.Oooooo0;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(WindowInsetsCompat windowInsetsCompat) {
        this.OooooO0.OooO0O0(windowInsetsCompat);
    }

    public void OooO0O0(@NonNull View view) {
        this.OooooO0.OooO00o(view);
    }

    public View OooO0Oo(int i) {
        return this.OooooO0.OooO0o0(i);
    }

    public void OooO0o(int i) {
        this.OooooO0.OooOo0(true);
        getMenuInflater().inflate(i, this.Ooooo0o);
        this.OooooO0.OooOo0(false);
        this.OooooO0.updateMenuView(false);
    }

    public View OooO0o0(@LayoutRes int i) {
        return this.OooooO0.OooOO0O(i);
    }

    public void OooO0oO(@NonNull View view) {
        this.OooooO0.OooOO0o(view);
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.OooooO0.OooO0OO();
    }

    public int getHeaderCount() {
        return this.OooooO0.OooO0Oo();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.OooooO0.OooO0o();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.OooooO0.OooO0oO();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.OooooO0.OooO0oo();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.OooooO0.OooOO0();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.OooooO0.OooO();
    }

    public Menu getMenu() {
        return this.Ooooo0o;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMin;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                iMin = this.OooooOo;
            }
            super.onMeasure(i, i2);
        }
        iMin = Math.min(View.MeasureSpec.getSize(i), this.OooooOo);
        i = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.Ooooo0o.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.Ooooo0o.savePresenterStates(bundle);
        return savedState;
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem menuItemFindItem = this.Ooooo0o.findItem(i);
        if (menuItemFindItem != null) {
            this.OooooO0.OooOOO0((MenuItemImpl) menuItemFindItem);
        }
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.Ooooo0o.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.OooooO0.OooOOO0((MenuItemImpl) menuItemFindItem);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.OooooO0.OooOOOO(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        this.OooooO0.OooOOOo(i);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) {
        this.OooooO0.OooOOOo(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@Dimension int i) {
        this.OooooO0.OooOOo0(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.OooooO0.OooOOo0(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.OooooO0.OooOOo(colorStateList);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.OooooO0.OooOOoo(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.OooooO0.OooOo00(colorStateList);
    }

    public void setNavigationItemSelectedListener(@Nullable OooO0O0 oooO0O0) {
        this.OooooOO = oooO0O0;
    }
}
