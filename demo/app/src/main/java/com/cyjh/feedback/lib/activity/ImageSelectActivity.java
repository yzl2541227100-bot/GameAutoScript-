package com.cyjh.feedback.lib.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.cyjh.feedback.libraryfeedbackinfo.C2618R;
import p285z2.C3691ah;
import p285z2.C4454v3;
import p285z2.ViewOnClickListenerC4314rb;

/* JADX INFO: loaded from: classes.dex */
public class ImageSelectActivity extends FragmentActivity implements View.OnClickListener {
    private ImageView OoooOoO;
    private TextView OoooOoo;

    private void initView() {
        this.OoooOoO = (ImageView) findViewById(C2618R.id.id_img_left_back_arrow);
        this.OoooOoo = (TextView) findViewById(C2618R.id.id_tv_title);
    }

    public void OooO0O0(Fragment fragment, String str) {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (str == null) {
            fragmentTransactionBeginTransaction.replace(C2618R.id.id_fl_replace_fragment, fragment);
        } else {
            fragmentTransactionBeginTransaction.replace(C2618R.id.id_fl_replace_fragment, fragment, str);
        }
        fragmentTransactionBeginTransaction.commit();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C2618R.id.id_img_left_back_arrow) {
            onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(C2618R.layout.activity_img_select);
        C4454v3.OooO().OooO00o(this);
        initView();
        this.OoooOoo.setText(getString(C2618R.string.img_select_title));
        this.OoooOoo.setVisibility(0);
        this.OoooOoO.setOnClickListener(this);
        OooO0O0(ViewOnClickListenerC4314rb.Oooo0OO(), "ImageSelectFragment");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Log.e("elfin", "ImageSelectActivity-- onDestroy");
        C4454v3.OooO().OooO0o0(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C3691ah.OooO0o0(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C3691ah.OooO0o(this);
    }
}
