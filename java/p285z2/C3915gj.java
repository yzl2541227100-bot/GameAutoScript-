package p285z2;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: z2.gj */
/* JADX INFO: loaded from: classes2.dex */
public class C3915gj extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> OooO0O0 = new C3915gj();
    private final WeakHashMap<Drawable, Integer> OooO00o;

    private C3915gj() {
        super(Integer.class, "drawableAlphaCompat");
        this.OooO00o = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.OooO00o.containsKey(drawable)) {
            return this.OooO00o.get(drawable);
        }
        return 255;
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.OooO00o.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
