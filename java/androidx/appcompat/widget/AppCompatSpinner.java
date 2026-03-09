package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0032R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {R.attr.spinnerMode};
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "AppCompatSpinner";
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    public int mDropDownWidth;
    private ForwardingListener mForwardingListener;
    public DropdownPopup mPopup;
    private final Context mPopupContext;
    private final boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    public final Rect mTempRect;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$1 */
    public class C00811 extends ForwardingListener {
        public final /* synthetic */ DropdownPopup val$popup;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00811(View view, DropdownPopup dropdownPopup) {
            super(view);
            dropdownPopup = dropdownPopup;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public ShowableListMenu getPopup() {
            return dropdownPopup;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public boolean onForwardingStarted() {
            if (AppCompatSpinner.this.mPopup.isShowing()) {
                return true;
            }
            AppCompatSpinner.this.mPopup.show();
            return true;
        }
    }

    public static class DropDownAdapter implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter mAdapter;
        private ListAdapter mListAdapter;

        public DropDownAdapter(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Resources.Theme theme) {
            this.mAdapter = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.mListAdapter = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter)) {
                    android.widget.ThemedSpinnerAdapter themedSpinnerAdapter = (android.widget.ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter2 = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter2.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter2.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class DropdownPopup extends ListPopupWindow {
        public ListAdapter mAdapter;
        private CharSequence mHintText;
        private final Rect mVisibleRect;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$1 */
        public class C00821 implements AdapterView.OnItemClickListener {
            public final /* synthetic */ AppCompatSpinner val$this$0;

            public C00821(AppCompatSpinner appCompatSpinner) {
                appCompatSpinner = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    DropdownPopup dropdownPopup = DropdownPopup.this;
                    AppCompatSpinner.this.performItemClick(view, i, dropdownPopup.mAdapter.getItemId(i));
                }
                DropdownPopup.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$2 */
        public class ViewTreeObserverOnGlobalLayoutListenerC00832 implements ViewTreeObserver.OnGlobalLayoutListener {
            public ViewTreeObserverOnGlobalLayoutListenerC00832() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                DropdownPopup dropdownPopup = DropdownPopup.this;
                if (!dropdownPopup.isVisibleToUser(AppCompatSpinner.this)) {
                    DropdownPopup.this.dismiss();
                } else {
                    DropdownPopup.this.computeContentWidth();
                    DropdownPopup.super.show();
                }
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$3 */
        public class C00843 implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener val$layoutListener;

            public C00843(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                onGlobalLayoutListener = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                }
            }
        }

        public DropdownPopup(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.mVisibleRect = new Rect();
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.1
                public final /* synthetic */ AppCompatSpinner val$this$0;

                public C00821(AppCompatSpinner appCompatSpinner) {
                    appCompatSpinner = appCompatSpinner;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                    AppCompatSpinner.this.setSelection(i2);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        DropdownPopup dropdownPopup = DropdownPopup.this;
                        AppCompatSpinner.this.performItemClick(view, i2, dropdownPopup.mAdapter.getItemId(i2));
                    }
                    DropdownPopup.this.dismiss();
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void computeContentWidth() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.getBackground()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.AppCompatSpinner r1 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r1 = r1.mTempRect
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.mTempRect
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.mTempRect
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.mTempRect
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = androidx.appcompat.widget.AppCompatSpinner.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = androidx.appcompat.widget.AppCompatSpinner.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                int r5 = r4.mDropDownWidth
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.mAdapter
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.getBackground()
                int r4 = r4.compatMeasureContentWidth(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = androidx.appcompat.widget.AppCompatSpinner.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r6 = r6.mTempRect
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.setContentWidth(r4)
                goto L85
            L82:
                r8.setContentWidth(r5)
            L85:
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r4 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r4)
                if (r4 == 0) goto L95
                int r3 = r3 - r2
                int r0 = r8.getWidth()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L96
            L95:
                int r1 = r1 + r0
            L96:
                r8.setHorizontalOffset(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.computeContentWidth():void");
        }

        public CharSequence getHintText() {
            return this.mHintText;
        }

        public boolean isVisibleToUser(View view) {
            return ViewCompat.isAttachedToWindow(view) && view.getGlobalVisibleRect(this.mVisibleRect);
        }

        @Override // androidx.appcompat.widget.ListPopupWindow
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.mAdapter = listAdapter;
        }

        public void setPromptText(CharSequence charSequence) {
            this.mHintText = charSequence;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.view.menu.ShowableListMenu
        public void show() {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            computeContentWidth();
            setInputMethodMode(2);
            super.show();
            getListView().setChoiceMode(1);
            setSelection(AppCompatSpinner.this.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC00832 viewTreeObserverOnGlobalLayoutListenerC00832 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.2
                public ViewTreeObserverOnGlobalLayoutListenerC00832() {
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    DropdownPopup dropdownPopup = DropdownPopup.this;
                    if (!dropdownPopup.isVisibleToUser(AppCompatSpinner.this)) {
                        DropdownPopup.this.dismiss();
                    } else {
                        DropdownPopup.this.computeContentWidth();
                        DropdownPopup.super.show();
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC00832);
            setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.3
                public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener val$layoutListener;

                public C00843(ViewTreeObserver.OnGlobalLayoutListener viewTreeObserverOnGlobalLayoutListenerC008322) {
                    onGlobalLayoutListener = viewTreeObserverOnGlobalLayoutListenerC008322;
                }

                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, C0032R.attr.spinnerStyle, i);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0032R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0056 A[PHI: r11 r12
  0x0056: PHI (r11v4 int) = (r11v0 int), (r11v6 int) binds: [B:84:0x0067, B:75:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r12v13 android.content.res.TypedArray) = (r12v12 android.content.res.TypedArray), (r12v15 android.content.res.TypedArray) binds: [B:84:0x0067, B:75:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.mTempRect);
        Rect rect = this.mTempRect;
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.applySupportBackgroundTint();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            return dropdownPopup.getHorizontalOffset();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            return dropdownPopup.getVerticalOffset();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.mPopup != null) {
            return this.mDropDownWidth;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            return dropdownPopup.getBackground();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.mPopup != null) {
            return this.mPopupContext;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        DropdownPopup dropdownPopup = this.mPopup;
        return dropdownPopup != null ? dropdownPopup.getHintText() : super.getPrompt();
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintList();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintMode();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup == null || !dropdownPopup.isShowing()) {
            return;
        }
        this.mPopup.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mPopup == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.mForwardingListener;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup == null) {
            return super.performClick();
        }
        if (dropdownPopup.isShowing()) {
            return true;
        }
        this.mPopup.show();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            Context context = this.mPopupContext;
            if (context == null) {
                context = getContext();
            }
            this.mPopup.setAdapter(new DropDownAdapter(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundResource(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            dropdownPopup.setHorizontalOffset(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            dropdownPopup.setVerticalOffset(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            dropdownPopup.setBackgroundDrawable(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(AppCompatResources.getDrawable(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            dropdownPopup.setPromptText(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintMode(mode);
        }
    }
}
