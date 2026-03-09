package p285z2;

import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.cyjh.feedback.libraryfeedbackinfo.C2618R;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p285z2.C3796db;

/* JADX INFO: renamed from: z2.rb */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC4314rb extends AbstractC3907gb implements View.OnClickListener {
    private static final int o0OoOo0 = 272;
    private static final String ooOO = ",";
    private GridView OoooOoo;
    private List<C4092lb> Ooooo00;
    private C3796db Ooooo0o;
    private Button OooooO0;
    private ArrayList<String> OooooOO;
    private List<String> OooooOo;
    private int Oooooo;
    private File Oooooo0;
    private ProgressDialog OoooooO;
    private Handler Ooooooo = new OooO00o();

    /* JADX INFO: renamed from: z2.rb$OooO00o */
    public class OooO00o extends Handler {
        public OooO00o() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C4092lb c4092lb = (C4092lb) message.obj;
            ViewOnClickListenerC4314rb.this.OoooooO.dismiss();
            ViewOnClickListenerC4314rb.this.OooOooo(c4092lb);
        }
    }

    /* JADX INFO: renamed from: z2.rb$OooO0O0 */
    public class OooO0O0 implements C3796db.OooO0O0 {
        public OooO0O0() {
        }

        @Override // p285z2.C3796db.OooO0O0
        public void OooO00o(int i) {
            ViewOnClickListenerC4314rb.this.OooooO0.setText(ViewOnClickListenerC4314rb.this.getString(C2618R.string.btn_sure, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: z2.rb$OooO0OO */
    public class OooO0OO extends Thread {

        /* JADX INFO: renamed from: z2.rb$OooO0OO$OooO00o */
        public class OooO00o implements FilenameFilter {
            public OooO00o() {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return ViewOnClickListenerC4314rb.this.Oooo000(str);
            }
        }

        public OooO0OO() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Cursor cursorQuery = ViewOnClickListenerC4314rb.this.getActivity().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "mime_type= ? or mime_type=?", new String[]{"image/jpeg", "image/png"}, "date_modified");
            HashSet hashSet = new HashSet();
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                File parentFile = new File(string).getParentFile();
                if (parentFile != null) {
                    String absolutePath = parentFile.getAbsolutePath();
                    if (!hashSet.contains(absolutePath)) {
                        hashSet.add(absolutePath);
                        C4092lb c4092lb = new C4092lb();
                        c4092lb.OooO0oo(absolutePath);
                        c4092lb.OooO(string);
                        if (parentFile.list() != null) {
                            int length = parentFile.list(new OooO00o()).length;
                            if (length > ViewOnClickListenerC4314rb.this.Oooooo) {
                                ViewOnClickListenerC4314rb.this.Oooooo = length;
                                ViewOnClickListenerC4314rb.this.Oooooo0 = parentFile;
                            }
                            c4092lb.OooO0o(length);
                            ViewOnClickListenerC4314rb.this.Ooooo00.add(c4092lb);
                        }
                    }
                }
            }
            cursorQuery.close();
            C4092lb c4092lb2 = new C4092lb();
            if (ViewOnClickListenerC4314rb.this.Ooooo00 != null && ViewOnClickListenerC4314rb.this.Ooooo00.size() > 0) {
                c4092lb2.OooO0oO(ViewOnClickListenerC4314rb.this.getString(C2618R.string.all_photo_mobile));
                c4092lb2.OooO(((C4092lb) ViewOnClickListenerC4314rb.this.Ooooo00.get(0)).OooO0Oo());
            }
            String str = "";
            int iOooO00o = 0;
            for (C4092lb c4092lb3 : ViewOnClickListenerC4314rb.this.Ooooo00) {
                str = str + c4092lb3.OooO0OO() + ViewOnClickListenerC4314rb.ooOO;
                iOooO00o += c4092lb3.OooO00o();
            }
            c4092lb2.OooO0o(iOooO00o);
            c4092lb2.OooO0oo(str);
            ViewOnClickListenerC4314rb.this.Ooooo00.add(0, c4092lb2);
            ViewOnClickListenerC4314rb.this.Oooo00O(c4092lb2);
            Message messageObtainMessage = ViewOnClickListenerC4314rb.this.Ooooooo.obtainMessage();
            messageObtainMessage.what = 272;
            messageObtainMessage.obj = c4092lb2;
            ViewOnClickListenerC4314rb.this.Ooooooo.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: renamed from: z2.rb$OooO0o */
    public class OooO0o implements FilenameFilter {
        public OooO0o() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return ViewOnClickListenerC4314rb.this.Oooo000(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOooo(C4092lb c4092lb) {
        if (TextUtils.isEmpty(c4092lb.OooO0OO())) {
            Toast.makeText(getActivity(), getString(C2618R.string.no_everything_picture), 0).show();
            return;
        }
        if (this.Oooooo0 == null) {
            Toast.makeText(getActivity(), getString(C2618R.string.no_everything_picture), 1).show();
            return;
        }
        List<String> list = this.OooooOo;
        if (list != null && list.size() <= 0) {
            Toast.makeText(getActivity(), getString(C2618R.string.no_everything_picture), 1).show();
            return;
        }
        C3796db c3796db = new C3796db(getActivity(), this.OooooOo);
        this.Ooooo0o = c3796db;
        this.OoooOoo.setAdapter((ListAdapter) c3796db);
        this.Ooooo0o.notifyDataSetChanged();
        Oooo0();
    }

    private void Oooo0() {
        this.Ooooo0o.OooO0o0(new OooO0O0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Oooo000(String str) {
        return str.toLowerCase().endsWith(".jpg") || str.toLowerCase().endsWith(".jpeg") || str.toLowerCase().endsWith(".png");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Oooo00O(C4092lb c4092lb) {
        this.OooooOo.clear();
        for (String str : c4092lb.OooO0OO().split(ooOO)) {
            String[] list = new File(str).list(new OooO0o());
            if (list != null) {
                for (String str2 : list) {
                    this.OooooOo.add(str + File.separator + str2);
                }
            }
        }
    }

    private void Oooo00o() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            Toast.makeText(getActivity(), getString(C2618R.string.no_sdk), 1).show();
        } else {
            this.OoooooO = ProgressDialog.show(getActivity(), null, getString(C2618R.string.loading_somethings));
            new OooO0OO().start();
        }
    }

    private void Oooo0O0(View view) {
        this.OooooOO = new ArrayList<>();
        this.OoooOoo = (GridView) view.findViewById(C2618R.id.grid_view);
        this.OooooOo = new ArrayList();
        this.Ooooo00 = new ArrayList();
        Button button = (Button) view.findViewById(C2618R.id.id_btn_sure);
        this.OooooO0 = button;
        button.setText(getString(C2618R.string.btn_sure, Integer.valueOf(this.OooooOO.size())));
        this.OooooO0.setOnClickListener(this);
    }

    public static ViewOnClickListenerC4314rb Oooo0OO() {
        return new ViewOnClickListenerC4314rb();
    }

    @Override // p285z2.AbstractC3907gb
    public int OooOo00() {
        return C2618R.layout.fragment_select_image;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C3796db c3796db;
        if (view.getId() != C2618R.id.id_btn_sure || (c3796db = this.Ooooo0o) == null) {
            return;
        }
        if (c3796db.OooO0Oo().size() <= 0) {
            Toast.makeText(getActivity(), getString(C2618R.string.please_choose_photo), 1).show();
            return;
        }
        Iterator<String> it = this.Ooooo0o.OooO0Oo().iterator();
        while (it.hasNext()) {
            this.OooooOO.add(it.next());
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(C1781c.c.f10525e, this.OooooOO);
        intent.putExtra("bundle", bundle);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C3691ah.OooO0OO(ViewOnClickListenerC4314rb.class.getCanonicalName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C3691ah.OooO0Oo(ViewOnClickListenerC4314rb.class.getCanonicalName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Oooo0O0(view);
        Oooo00o();
    }
}
