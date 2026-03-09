package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0032R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.AutoSizeableTextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private boolean mAsyncFontPending;

    @NonNull
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;
    private int mStyle = 0;
    private final TextView mView;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatTextHelper$1 */
    public class C00851 extends ResourcesCompat.FontCallback {
        public final /* synthetic */ WeakReference val$textViewWeak;

        public C00851(WeakReference weakReference) {
            weakReference = weakReference;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrievalFailed(int i) {
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrieved(@NonNull Typeface typeface) {
            AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    private void setTextSizeInternal(int i, float f) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i, f);
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        Typeface typeface;
        this.mStyle = tintTypedArray.getInt(C0032R.styleable.TextAppearance_android_textStyle, this.mStyle);
        int i = C0032R.styleable.TextAppearance_android_fontFamily;
        if (tintTypedArray.hasValue(i) || tintTypedArray.hasValue(C0032R.styleable.TextAppearance_fontFamily)) {
            this.mFontTypeface = null;
            int i2 = C0032R.styleable.TextAppearance_fontFamily;
            if (tintTypedArray.hasValue(i2)) {
                i = i2;
            }
            if (!context.isRestricted()) {
                try {
                    Typeface font = tintTypedArray.getFont(i, this.mStyle, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                        public final /* synthetic */ WeakReference val$textViewWeak;

                        public C00851(WeakReference weakReference) {
                            weakReference = weakReference;
                        }

                        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                        public void onFontRetrievalFailed(int i3) {
                        }

                        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                        public void onFontRetrieved(@NonNull Typeface typeface2) {
                            AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface2);
                        }
                    });
                    this.mFontTypeface = font;
                    this.mAsyncFontPending = font == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.mFontTypeface != null || (string = tintTypedArray.getString(i)) == null) {
                return;
            }
            this.mFontTypeface = Typeface.create(string, this.mStyle);
            return;
        }
        int i3 = C0032R.styleable.TextAppearance_android_typeface;
        if (tintTypedArray.hasValue(i3)) {
            this.mAsyncFontPending = false;
            int i4 = tintTypedArray.getInt(i3, 1);
            if (i4 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                typeface = Typeface.SERIF;
            } else if (i4 != 3) {
                return;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.mFontTypeface = typeface;
        }
    }

    public void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
            applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    public int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    public int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00b6  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadFromAttributes(android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    public void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.mStyle);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return;
        }
        autoSizeText();
    }

    public void onSetTextAppearance(Context context, int i) {
        ColorStateList colorStateList;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, C0032R.styleable.TextAppearance);
        int i2 = C0032R.styleable.TextAppearance_textAllCaps;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i2)) {
            setAllCaps(tintTypedArrayObtainStyledAttributes.getBoolean(i2, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            int i3 = C0032R.styleable.TextAppearance_android_textColor;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i3) && (colorStateList = tintTypedArrayObtainStyledAttributes.getColorStateList(i3)) != null) {
                this.mView.setTextColor(colorStateList);
            }
        }
        int i4 = C0032R.styleable.TextAppearance_android_textSize;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i4) && tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(i4, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes);
        tintTypedArrayObtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    public void setAllCaps(boolean z) {
        this.mView.setAllCaps(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setTextSize(int i, float f) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE || isAutoSizeEnabled()) {
            return;
        }
        setTextSizeInternal(i, f);
    }
}
