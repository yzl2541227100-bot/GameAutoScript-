package p285z2;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;

/* JADX INFO: renamed from: z2.bf */
/* JADX INFO: loaded from: classes2.dex */
public final class C3726bf extends ArrayAdapter<String> {
    public List<String> OoooOoO;

    public C3726bf(Context context, List<String> list) {
        super(context, R.layout.simple_spinner_item, list);
        this.OoooOoO = list;
    }

    private List<String> OooO00o() {
        return this.OoooOoO;
    }
}
