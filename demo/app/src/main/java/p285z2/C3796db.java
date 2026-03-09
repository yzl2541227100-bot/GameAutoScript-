package p285z2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import com.cyjh.feedback.lib.utils.ImageLoader;
import com.cyjh.feedback.libraryfeedbackinfo.C2618R;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: z2.db */
/* JADX INFO: loaded from: classes.dex */
public class C3796db extends BaseAdapter {
    private Context OoooOoO;
    private LayoutInflater OoooOoo;
    private List<String> Ooooo00;
    private Set<String> Ooooo0o = new HashSet();
    private OooO0O0 OooooO0;

    /* JADX INFO: renamed from: z2.db$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public final /* synthetic */ String OoooOoO;
        public final /* synthetic */ OooO0OO OoooOoo;

        public OooO00o(String str, OooO0OO oooO0OO) {
            this.OoooOoO = str;
            this.OoooOoo = oooO0OO;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageButton imageButton;
            int i;
            Context context;
            Context context2;
            int i2;
            long length = (new File(this.OoooOoO).length() / 1024) - PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            C3796db c3796db = C3796db.this;
            if (length <= 0) {
                if (c3796db.Ooooo0o.contains(this.OoooOoO)) {
                    C3796db.this.Ooooo0o.remove(this.OoooOoO);
                    this.OoooOoo.OooO00o.setColorFilter((ColorFilter) null);
                    imageButton = this.OoooOoo.OooO0O0;
                    i = 4;
                } else if (C3796db.this.Ooooo0o.size() > 3) {
                    context = C3796db.this.OoooOoO;
                    context2 = C3796db.this.OoooOoO;
                    i2 = C2618R.string.img_count_more;
                } else {
                    C3796db.this.Ooooo0o.add(this.OoooOoO);
                    this.OoooOoo.OooO00o.setColorFilter(Color.parseColor("#77000000"));
                    imageButton = this.OoooOoo.OooO0O0;
                    i = 0;
                }
                imageButton.setVisibility(i);
                if (C3796db.this.OooooO0 != null) {
                    C3796db.this.OooooO0.OooO00o(C3796db.this.Ooooo0o.size());
                    return;
                }
                return;
            }
            context = c3796db.OoooOoO;
            context2 = C3796db.this.OoooOoO;
            i2 = C2618R.string.img_content_too_large;
            Toast.makeText(context, context2.getString(i2), 1).show();
        }
    }

    /* JADX INFO: renamed from: z2.db$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(int i);
    }

    /* JADX INFO: renamed from: z2.db$OooO0OO */
    public class OooO0OO {
        public ImageView OooO00o;
        public ImageButton OooO0O0;

        public OooO0OO() {
        }
    }

    public C3796db(Context context, List<String> list) {
        this.OoooOoO = context;
        this.OoooOoo = LayoutInflater.from(context);
        this.Ooooo00 = list;
    }

    public Set<String> OooO0Oo() {
        return this.Ooooo0o;
    }

    public void OooO0o0(OooO0O0 oooO0O0) {
        this.OooooO0 = oooO0O0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.Ooooo00.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.Ooooo00.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        OooO0OO oooO0OO;
        if (view == null) {
            oooO0OO = new OooO0OO();
            viewInflate = this.OoooOoo.inflate(C2618R.layout.image_adapter_item, viewGroup, false);
            oooO0OO.OooO0O0 = (ImageButton) viewInflate.findViewById(C2618R.id.id_img_select_grid_item);
            oooO0OO.OooO00o = (ImageView) viewInflate.findViewById(C2618R.id.id_img_grid_item);
            viewInflate.setTag(oooO0OO);
        } else {
            viewInflate = view;
            oooO0OO = (OooO0OO) view.getTag();
        }
        oooO0OO.OooO00o.setImageResource(C2618R.mipmap.pictures_no);
        String str = this.Ooooo00.get(i);
        ImageLoader.OooOOo(ImageLoader.Type.FILO, 3).OooOo00(str, oooO0OO.OooO00o);
        oooO0OO.OooO00o.setColorFilter((ColorFilter) null);
        oooO0OO.OooO0O0.setVisibility(4);
        if (this.Ooooo0o.contains(str)) {
            oooO0OO.OooO00o.setColorFilter(Color.parseColor("#77000000"));
            oooO0OO.OooO0O0.setVisibility(0);
        }
        oooO0OO.OooO00o.setOnClickListener(new OooO00o(str, oooO0OO));
        return viewInflate;
    }
}
