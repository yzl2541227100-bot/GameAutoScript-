package p285z2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.PreloadTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class o0O0o<TranscodeType> extends AbstractC3971i1<o0O0o<TranscodeType>> implements Cloneable, o0oOOo<o0O0o<TranscodeType>> {
    public static final C4230p1 o0000oO0 = new C4230p1().OooOOoo(o0oo0000.OooO0OO).o0OO00O(Priority.LOW).o00000O0(true);
    private final Class<TranscodeType> o0000O;
    private final Context o0000O0O;
    private final o0O00o0 o0000OO;
    private final o00Oo00 o0000OO0;

    @NonNull
    private o0O00000<?, ? super TranscodeType> o0000OOO;

    @Nullable
    private Object o0000OOo;

    @Nullable
    private o0O0o<TranscodeType> o0000Oo;

    @Nullable
    private List<InterfaceC4193o1<TranscodeType>> o0000Oo0;

    @Nullable
    private o0O0o<TranscodeType> o0000OoO;
    private boolean o0000o;

    @Nullable
    private Float o0000o0;
    private boolean o0000o0O;
    private boolean o0000o0o;
    private final C4192o0 o000OO;

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;
        public static final /* synthetic */ int[] OooO0O0;

        static {
            int[] iArr = new int[Priority.values().length];
            OooO0O0 = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OooO0O0[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OooO0O0[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OooO0O0[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            OooO00o = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OooO00o[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OooO00o[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                OooO00o[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                OooO00o[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                OooO00o[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                OooO00o[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                OooO00o[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public o0O0o(Class<TranscodeType> cls, o0O0o<?> o0o0o) {
        this(o0o0o.o0000OO0, o0o0o.o000OO, cls, o0o0o.o0000O0O);
        this.o0000OOo = o0o0o.o0000OOo;
        this.o0000o0o = o0o0o.o0000o0o;
        OooOO0O(o0o0o);
    }

    @SuppressLint({"CheckResult"})
    public o0O0o(@NonNull o00Oo00 o00oo00, C4192o0 c4192o0, Class<TranscodeType> cls, Context context) {
        this.o0000o0O = true;
        this.o0000OO0 = o00oo00;
        this.o000OO = c4192o0;
        this.o0000O = cls;
        this.o0000O0O = context;
        this.o0000OOO = c4192o0.OooOo0o(cls);
        this.o0000OO = o00oo00.OooOO0();
        o0000o0(c4192o0.OooOo0());
        OooOO0O(c4192o0.OooOo0O());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InterfaceC4082l1 o0000O(Target<TranscodeType> target, @Nullable InterfaceC4193o1<TranscodeType> interfaceC4193o1, @Nullable InterfaceC4119m1 interfaceC4119m1, o0O00000<?, ? super TranscodeType> o0o00000, Priority priority, int i, int i2, AbstractC3971i1<?> abstractC3971i1, Executor executor) {
        InterfaceC4119m1 interfaceC4119m12;
        InterfaceC4119m1 c4008j1;
        if (this.o0000OoO != null) {
            c4008j1 = new C4008j1(interfaceC4119m1);
            interfaceC4119m12 = c4008j1;
        } else {
            interfaceC4119m12 = null;
            c4008j1 = interfaceC4119m1;
        }
        InterfaceC4082l1 interfaceC4082l1O0000OO0 = o0000OO0(target, interfaceC4193o1, c4008j1, o0o00000, priority, i, i2, abstractC3971i1, executor);
        if (interfaceC4119m12 == null) {
            return interfaceC4082l1O0000OO0;
        }
        int iOooo0oO = this.o0000OoO.Oooo0oO();
        int iOooo0o = this.o0000OoO.Oooo0o();
        if (C4379t2.OooOo0O(i, i2) && !this.o0000OoO.o0OoOo0()) {
            iOooo0oO = abstractC3971i1.Oooo0oO();
            iOooo0o = abstractC3971i1.Oooo0o();
        }
        o0O0o<TranscodeType> o0o0o = this.o0000OoO;
        C4008j1 c4008j12 = interfaceC4119m12;
        c4008j12.OooOOo(interfaceC4082l1O0000OO0, o0o0o.o0000O(target, interfaceC4193o1, interfaceC4119m12, o0o0o.o0000OOO, o0o0o.OoooO00(), iOooo0oO, iOooo0o, this.o0000OoO, executor));
        return c4008j12;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private InterfaceC4082l1 o0000OO0(Target<TranscodeType> target, InterfaceC4193o1<TranscodeType> interfaceC4193o1, @Nullable InterfaceC4119m1 interfaceC4119m1, o0O00000<?, ? super TranscodeType> o0o00000, Priority priority, int i, int i2, AbstractC3971i1<?> abstractC3971i1, Executor executor) {
        o0O0o<TranscodeType> o0o0o = this.o0000Oo;
        if (o0o0o == null) {
            if (this.o0000o0 == null) {
                return o000O0(target, interfaceC4193o1, abstractC3971i1, interfaceC4119m1, o0o00000, priority, i, i2, executor);
            }
            C4304r1 c4304r1 = new C4304r1(interfaceC4119m1);
            c4304r1.OooOOo0(o000O0(target, interfaceC4193o1, abstractC3971i1, c4304r1, o0o00000, priority, i, i2, executor), o000O0(target, interfaceC4193o1, abstractC3971i1.clone().o00000(this.o0000o0.floatValue()), c4304r1, o0o00000, o0000OoO(priority), i, i2, executor));
            return c4304r1;
        }
        if (this.o0000o) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        o0O00000<?, ? super TranscodeType> o0o000002 = o0o0o.o0000o0O ? o0o00000 : o0o0o.o0000OOO;
        Priority priorityOoooO00 = o0o0o.Ooooo0o() ? this.o0000Oo.OoooO00() : o0000OoO(priority);
        int iOooo0oO = this.o0000Oo.Oooo0oO();
        int iOooo0o = this.o0000Oo.Oooo0o();
        if (C4379t2.OooOo0O(i, i2) && !this.o0000Oo.o0OoOo0()) {
            iOooo0oO = abstractC3971i1.Oooo0oO();
            iOooo0o = abstractC3971i1.Oooo0o();
        }
        int i3 = iOooo0oO;
        int i4 = iOooo0o;
        C4304r1 c4304r12 = new C4304r1(interfaceC4119m1);
        InterfaceC4082l1 interfaceC4082l1O000O0 = o000O0(target, interfaceC4193o1, abstractC3971i1, c4304r12, o0o00000, priority, i, i2, executor);
        this.o0000o = true;
        o0O0o<TranscodeType> o0o0o2 = this.o0000Oo;
        InterfaceC4082l1 interfaceC4082l1O0000O = o0o0o2.o0000O(target, interfaceC4193o1, c4304r12, o0o000002, priorityOoooO00, i3, i4, o0o0o2, executor);
        this.o0000o = false;
        c4304r12.OooOOo0(interfaceC4082l1O000O0, interfaceC4082l1O0000O);
        return c4304r12;
    }

    @NonNull
    private Priority o0000OoO(@NonNull Priority priority) {
        int i = OooO00o.OooO0O0[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + OoooO00());
    }

    private <Y extends Target<TranscodeType>> Y o0000o(@NonNull Y y, @Nullable InterfaceC4193o1<TranscodeType> interfaceC4193o1, AbstractC3971i1<?> abstractC3971i1, Executor executor) {
        C4305r2.OooO0Oo(y);
        if (!this.o0000o0o) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC4082l1 interfaceC4082l1O000OO = o000OO(y, interfaceC4193o1, abstractC3971i1, executor);
        InterfaceC4082l1 request = y.getRequest();
        if (!interfaceC4082l1O000OO.OooO0OO(request) || o0000oOo(abstractC3971i1, request)) {
            this.o000OO.OooOOo(y);
            y.setRequest(interfaceC4082l1O000OO);
            this.o000OO.Oooo0oo(y, interfaceC4082l1O000OO);
            return y;
        }
        interfaceC4082l1O000OO.recycle();
        if (!((InterfaceC4082l1) C4305r2.OooO0Oo(request)).isRunning()) {
            request.OooO();
        }
        return y;
    }

    @SuppressLint({"CheckResult"})
    private void o0000o0(List<InterfaceC4193o1<Object>> list) {
        Iterator<InterfaceC4193o1<Object>> it = list.iterator();
        while (it.hasNext()) {
            o0000O0((InterfaceC4193o1) it.next());
        }
    }

    private boolean o0000oOo(AbstractC3971i1<?> abstractC3971i1, InterfaceC4082l1 interfaceC4082l1) {
        return !abstractC3971i1.Ooooo00() && interfaceC4082l1.OooOO0O();
    }

    private InterfaceC4082l1 o000O0(Target<TranscodeType> target, InterfaceC4193o1<TranscodeType> interfaceC4193o1, AbstractC3971i1<?> abstractC3971i1, InterfaceC4119m1 interfaceC4119m1, o0O00000<?, ? super TranscodeType> o0o00000, Priority priority, int i, int i2, Executor executor) {
        Context context = this.o0000O0O;
        o0O00o0 o0o00o0 = this.o0000OO;
        return SingleRequest.OooOoO(context, o0o00o0, this.o0000OOo, this.o0000O, abstractC3971i1, i, i2, priority, target, interfaceC4193o1, this.o0000Oo0, interfaceC4119m1, o0o00o0.OooO0o(), o0o00000.OooO0OO(), executor);
    }

    @NonNull
    private o0O0o<TranscodeType> o000O00O(@Nullable Object obj) {
        this.o0000OOo = obj;
        this.o0000o0o = true;
        return this;
    }

    private InterfaceC4082l1 o000OO(Target<TranscodeType> target, @Nullable InterfaceC4193o1<TranscodeType> interfaceC4193o1, AbstractC3971i1<?> abstractC3971i1, Executor executor) {
        return o0000O(target, interfaceC4193o1, null, this.o0000OOO, abstractC3971i1.OoooO00(), abstractC3971i1.Oooo0oO(), abstractC3971i1.Oooo0o(), abstractC3971i1, executor);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o000 */
    public o0O0o<TranscodeType> OooO0o0(@Nullable Drawable drawable) {
        return o000O00O(drawable).OooOO0O(C4230p1.o0000OO(o0oo0000.OooO0O0));
    }

    @NonNull
    @CheckResult
    public o0O0o<TranscodeType> o0000O0(@Nullable InterfaceC4193o1<TranscodeType> interfaceC4193o1) {
        if (interfaceC4193o1 != null) {
            if (this.o0000Oo0 == null) {
                this.o0000Oo0 = new ArrayList();
            }
            this.o0000Oo0.add(interfaceC4193o1);
        }
        return this;
    }

    @Override // p285z2.AbstractC3971i1
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o0000O0O */
    public o0O0o<TranscodeType> OooOO0O(@NonNull AbstractC3971i1<?> abstractC3971i1) {
        C4305r2.OooO0Oo(abstractC3971i1);
        return (o0O0o) super.OooOO0O(abstractC3971i1);
    }

    @Override // p285z2.AbstractC3971i1
    @CheckResult
    /* JADX INFO: renamed from: o0000OO, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public o0O0o<TranscodeType> clone() {
        o0O0o<TranscodeType> o0o0o = (o0O0o) super.clone();
        o0o0o.o0000OOO = o0o0o.o0000OOO.clone();
        return o0o0o;
    }

    @CheckResult
    @Deprecated
    public InterfaceFutureC4045k1<File> o0000OOO(int i, int i2) {
        return o0000Oo().o000O0o0(i, i2);
    }

    @CheckResult
    @Deprecated
    public <Y extends Target<File>> Y o0000OOo(@NonNull Y y) {
        return (Y) o0000Oo().o0000o0o(y);
    }

    @NonNull
    @CheckResult
    public o0O0o<File> o0000Oo() {
        return new o0O0o(File.class, this).OooOO0O(o0000oO0);
    }

    @NonNull
    public o0O0o<TranscodeType> o0000Oo0(@Nullable o0O0o<TranscodeType> o0o0o) {
        this.o0000OoO = o0o0o;
        return this;
    }

    @Deprecated
    public InterfaceFutureC4045k1<TranscodeType> o0000o0O(int i, int i2) {
        return o000O0o0(i, i2);
    }

    @NonNull
    public <Y extends Target<TranscodeType>> Y o0000o0o(@NonNull Y y) {
        return (Y) o0000oO0(y, null, C4083l2.OooO0O0());
    }

    @NonNull
    public <Y extends Target<TranscodeType>> Y o0000oO0(@NonNull Y y, @Nullable InterfaceC4193o1<TranscodeType> interfaceC4193o1, Executor executor) {
        return (Y) o0000o(y, interfaceC4193o1, this, executor);
    }

    @NonNull
    public ViewTarget<ImageView, TranscodeType> o0000oOO(@NonNull ImageView imageView) {
        AbstractC3971i1 abstractC3971i1O00Oo0;
        C4379t2.OooO0O0();
        C4305r2.OooO0Oo(imageView);
        if (!Ooooooo() && Oooooo() && imageView.getScaleType() != null) {
            switch (OooO00o.OooO00o[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC3971i1O00Oo0 = clone().o00Oo0();
                    break;
                case 2:
                case 6:
                    abstractC3971i1O00Oo0 = clone().o00Ooo();
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC3971i1O00Oo0 = clone().o00ooo();
                    break;
                default:
                    abstractC3971i1O00Oo0 = this;
                    break;
            }
        } else {
            abstractC3971i1O00Oo0 = this;
        }
        return (ViewTarget) o0000o(this.o0000OO.OooO00o(imageView, this.o0000O), null, abstractC3971i1O00Oo0, C4083l2.OooO0O0());
    }

    @NonNull
    @CheckResult
    public o0O0o<TranscodeType> o0000oo0(@Nullable InterfaceC4193o1<TranscodeType> interfaceC4193o1) {
        this.o0000Oo0 = null;
        return o0000O0(interfaceC4193o1);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o0000ooO */
    public o0O0o<TranscodeType> OooO0o(@Nullable Bitmap bitmap) {
        return o000O00O(bitmap).OooOO0O(C4230p1.o0000OO(o0oo0000.OooO0O0));
    }

    @NonNull
    @CheckResult
    public o0O0o<TranscodeType> o000O(@Nullable o0O0o<TranscodeType>... o0o0oArr) {
        o0O0o<TranscodeType> o0o0oO000O0oo = null;
        if (o0o0oArr == null || o0o0oArr.length == 0) {
            return o000O0oo(null);
        }
        for (int length = o0o0oArr.length - 1; length >= 0; length--) {
            o0O0o<TranscodeType> o0o0o = o0o0oArr[length];
            if (o0o0o != null) {
                o0o0oO000O0oo = o0o0oO000O0oo == null ? o0o0o : o0o0o.o000O0oo(o0o0oO000O0oo);
            }
        }
        return o000O0oo(o0o0oO000O0oo);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o000O00 */
    public o0O0o<TranscodeType> OooO0OO(@Nullable byte[] bArr) {
        o0O0o<TranscodeType> o0o0oO000O00O = o000O00O(bArr);
        if (!o0o0oO000O00O.OoooOoO()) {
            o0o0oO000O00O = o0o0oO000O00O.OooOO0O(C4230p1.o0000OO(o0oo0000.OooO0O0));
        }
        return !o0o0oO000O00O.Oooooo0() ? o0o0oO000O00O.OooOO0O(C4230p1.o000Ooo(true)) : o0o0oO000O00O;
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o000O000 */
    public o0O0o<TranscodeType> OooO0O0(@Nullable Uri uri) {
        return o000O00O(uri);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o000O0O */
    public o0O0o<TranscodeType> OooO(@Nullable String str) {
        return o000O00O(str);
    }

    @NonNull
    public InterfaceFutureC4045k1<TranscodeType> o000O0O0() {
        return o000O0o0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    public Target<TranscodeType> o000O0Oo() {
        return o000OO0O(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o000O0o */
    public o0O0o<TranscodeType> OooO0oo(@Nullable @DrawableRes @RawRes Integer num) {
        return o000O00O(num).OooOO0O(C4230p1.o000OoO(C3787d2.OooO0OO(this.o0000O0O)));
    }

    @NonNull
    public InterfaceFutureC4045k1<TranscodeType> o000O0o0(int i, int i2) {
        C4156n1 c4156n1 = new C4156n1(i, i2);
        return (InterfaceFutureC4045k1) o0000oO0(c4156n1, c4156n1, C4083l2.OooO00o());
    }

    @NonNull
    @CheckResult
    public o0O0o<TranscodeType> o000O0oO(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.o0000o0 = Float.valueOf(f);
        return this;
    }

    @NonNull
    @CheckResult
    public o0O0o<TranscodeType> o000O0oo(@Nullable o0O0o<TranscodeType> o0o0o) {
        this.o0000Oo = o0o0o;
        return this;
    }

    @NonNull
    @CheckResult
    public o0O0o<TranscodeType> o000OO00(@NonNull o0O00000<?, ? super TranscodeType> o0o00000) {
        this.o0000OOO = (o0O00000) C4305r2.OooO0Oo(o0o00000);
        this.o0000o0O = false;
        return this;
    }

    @NonNull
    public Target<TranscodeType> o000OO0O(int i, int i2) {
        return o0000o0o(PreloadTarget.obtain(this.o000OO, i, i2));
    }

    @Override // p285z2.o0oOOo
    @CheckResult
    @Deprecated
    /* JADX INFO: renamed from: o000Oo0 */
    public o0O0o<TranscodeType> OooO00o(@Nullable URL url) {
        return o000O00O(url);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o000OoO */
    public o0O0o<TranscodeType> OooO0Oo(@Nullable File file) {
        return o000O00O(file);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o000Ooo */
    public o0O0o<TranscodeType> OooO0oO(@Nullable Object obj) {
        return o000O00O(obj);
    }
}
