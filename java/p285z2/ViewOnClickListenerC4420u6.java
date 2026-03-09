package p285z2;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import androidx.appcompat.widget.ActivityChooserModel;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.ScriptLog;
import com.cyjh.elfin.p200ui.activity.ScriptLogDetailActivity;
import com.cyjh.http.bean.request.UpdateRequestInfo;
import com.cyjh.http.bean.response.VersionUpdateInfo;
import com.ywfzjbcy.R;
import java.io.File;
import java.util.Arrays;
import p285z2.C3982ic;
import p285z2.C4048k4;

/* JADX INFO: renamed from: z2.u6 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC4420u6 extends DialogC4423u9 implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private static final int o00oO0O = 24;
    private static final int o00oO0o = 19;
    public static final String oo000o = ViewOnClickListenerC4420u6.class.getSimpleName();
    private Switch Ooooo0o;
    private Switch OooooO0;
    private Switch OooooOO;
    private Switch OooooOo;
    private Switch Oooooo;
    private Switch Oooooo0;
    private Switch OoooooO;
    private Switch Ooooooo;
    private Switch o00O0O;
    private LinearLayout o00Oo0;
    public Context o00Ooo;
    private boolean o00o0O;
    private String[] o00ooo;
    private Spinner o0OoOo0;
    private Switch ooOO;

    /* JADX INFO: renamed from: z2.u6$OooO00o */
    public class OooO00o implements AdapterView.OnItemSelectedListener {
        public OooO00o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C4529x4.OooO0O0().OooO0oO(InterfaceC3865f6.OooOo0o, Integer.parseInt(ViewOnClickListenerC4420u6.this.o00ooo[i].replace("秒", "")));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: z2.u6$OooO0O0 */
    public class OooO0O0 implements C3982ic.OooO00o {
        public OooO0O0() {
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO00o(VersionUpdateInfo versionUpdateInfo) {
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO0O0(VersionUpdateInfo versionUpdateInfo) {
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO0OO(VersionUpdateInfo versionUpdateInfo) {
            String str = ViewOnClickListenerC4420u6.oo000o;
            if (versionUpdateInfo == null) {
                return;
            }
            new ViewOnClickListenerC3684aa(ViewOnClickListenerC4420u6.this.getContext(), versionUpdateInfo, true).show();
        }
    }

    public ViewOnClickListenerC4420u6(Context context) {
        Window window;
        int i;
        super(context, R.style.Theme_Dialog);
        this.o00ooo = new String[]{"5秒", "10秒", "15秒", "30秒", "60秒"};
        this.OoooOoO = (AppContext) context.getApplicationContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            window = getWindow();
            i = 2038;
        } else if (i2 < 19 || i2 >= 24) {
            if (getWindow() == null) {
                return;
            }
            window = getWindow();
            i = 2002;
        } else {
            if (getWindow() == null) {
                return;
            }
            window = getWindow();
            i = 2005;
        }
        window.setType(i);
    }

    private void OooO() {
        if (C3974i4.OooO00o().OooO0O0()) {
            return;
        }
        if (!C4381t4.OooOO0(getContext())) {
            C3753c5.OooO0O0(getContext().getApplicationContext(), R.string.network_off);
            return;
        }
        this.o00o0O = false;
        String strOooO0Oo = C4533x8.OooO0Oo(getContext(), InterfaceC3865f6.OooO0oo);
        String strOooOO0O = C3678a4.OooOO0O(getContext());
        UpdateRequestInfo updateRequestInfo = new UpdateRequestInfo();
        updateRequestInfo.ScriptId = C3718b7.OooO0Oo().OooO0oO().getId();
        updateRequestInfo.DeviceName = strOooOO0O;
        updateRequestInfo.ScriptVersion = Integer.parseInt(strOooO0Oo);
        String str = "updateVersionRequest --> 1 ScriptId=" + updateRequestInfo.ScriptId + ",DeviceName=" + updateRequestInfo.DeviceName + ",ScriptVersion=" + updateRequestInfo.ScriptVersion;
        C3982ic.OooOo00().OooOo0O(new OooO0O0()).OooOo(true, getContext(), updateRequestInfo);
    }

    private void OooO0o() {
        Switch r0 = this.Ooooo0o;
        C4529x4 c4529x4OooO0O0 = C4529x4.OooO0O0();
        Boolean bool = Boolean.TRUE;
        r0.setChecked(c4529x4OooO0O0.OooO00o(InterfaceC3865f6.OooOO0O, bool));
        this.OooooO0.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOO0o, bool));
        this.OooooOO.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOO0, bool));
        this.OooooOo.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOO, bool));
        this.Oooooo0.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOOO, bool));
        Switch r02 = this.OoooooO;
        C4529x4 c4529x4OooO0O02 = C4529x4.OooO0O0();
        Boolean bool2 = Boolean.FALSE;
        r02.setChecked(c4529x4OooO0O02.OooO00o(InterfaceC3865f6.OooOOo0, bool2));
        this.ooOO.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOo, bool2));
        this.o00O0O.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOoo, bool2));
        this.Oooooo.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOo0, bool2));
        this.Ooooooo.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOo0O, bool2));
    }

    private void OooO0oO() {
        this.Ooooo0o = (Switch) findViewById(R.id.setting_swtich_call_stop);
        this.OooooO0 = (Switch) findViewById(R.id.setting_swtich_volume_key_ctrl);
        this.OooooOO = (Switch) findViewById(R.id.setting_swtich_waggle_stop);
        this.OooooOo = (Switch) findViewById(R.id.setting_swtich_floatview_ctrl);
        this.Oooooo0 = (Switch) findViewById(R.id.setting_swtich_vibration);
        this.Oooooo = (Switch) findViewById(R.id.switch_setting_flash_back_auto_restart);
        this.OoooooO = (Switch) findViewById(R.id.setting_swtich_open_run);
        this.Ooooooo = (Switch) findViewById(R.id.switch_setting_automatically_run_script);
        this.o0OoOo0 = (Spinner) findViewById(R.id.sp_run_script_countdown);
        this.ooOO = (Switch) findViewById(R.id.switch_setting_collect_logcat);
        this.o00O0O = (Switch) findViewById(R.id.switch_setting_error_dialog);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_boot_script);
        this.o00Oo0 = linearLayout;
        linearLayout.setVisibility(0);
        Button button = (Button) findViewById(R.id.setting_button_scriptlog);
        Button button2 = (Button) findViewById(R.id.setting_button_update);
        Button button3 = (Button) findViewById(R.id.setting_button_exitapp);
        ImageView imageView = (ImageView) findViewById(R.id.setting_dialog_imageview_back);
        this.Ooooo0o.setOnCheckedChangeListener(this);
        this.OooooO0.setOnCheckedChangeListener(this);
        this.OooooOO.setOnCheckedChangeListener(this);
        this.OooooOo.setOnCheckedChangeListener(this);
        this.Oooooo0.setOnCheckedChangeListener(this);
        this.OoooooO.setOnCheckedChangeListener(this);
        this.ooOO.setOnCheckedChangeListener(this);
        this.o00O0O.setOnCheckedChangeListener(this);
        this.Oooooo.setOnCheckedChangeListener(this);
        this.Ooooooo.setOnCheckedChangeListener(this);
        button.setOnClickListener(this);
        button3.setOnClickListener(this);
        button2.setOnClickListener(this);
        imageView.setOnClickListener(this);
        OooO0o();
        this.o0OoOo0.setAdapter((SpinnerAdapter) new ArrayAdapter(getContext(), R.layout.my_spinner, this.o00ooo));
        this.o0OoOo0.setOnItemSelectedListener(new OooO00o());
        int iOooO0OO = C4529x4.OooO0O0().OooO0OO(InterfaceC3865f6.OooOo0o, 5);
        this.o0OoOo0.setSelection(Arrays.asList(this.o00ooo).indexOf(iOooO0OO + "秒"));
    }

    public boolean OooO0oo() {
        return this.o00o0O;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        C3982ic.OooOo00().OooOo0();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C4529x4 c4529x4OooO0O0;
        Boolean boolValueOf;
        String str;
        Switch r3;
        int id = compoundButton.getId();
        switch (id) {
            case R.id.setting_swtich_call_stop /* 2131297266 */:
                c4529x4OooO0O0 = C4529x4.OooO0O0();
                boolValueOf = Boolean.valueOf(z);
                str = InterfaceC3865f6.OooOO0O;
                c4529x4OooO0O0.OooO0o(str, boolValueOf);
                return;
            case R.id.setting_swtich_floatview_ctrl /* 2131297267 */:
                if (z || this.OooooO0.isChecked()) {
                    C4529x4.OooO0O0().OooO0o(InterfaceC3865f6.OooOOO, Boolean.valueOf(z));
                    C4605z6.OooO0Oo().OooO0OO().OoooOoo();
                    return;
                } else {
                    this.OoooOoO.OooOO0(R.string.setting_illegal);
                    r3 = this.OooooOo;
                }
                break;
            case R.id.setting_swtich_open_run /* 2131297268 */:
                C4529x4.OooO0O0().OooO0o(InterfaceC3865f6.OooOOo0, Boolean.valueOf(z));
                C3678a4.OooOoo(getContext(), z);
                return;
            case R.id.setting_swtich_vibration /* 2131297269 */:
                c4529x4OooO0O0 = C4529x4.OooO0O0();
                boolValueOf = Boolean.valueOf(z);
                str = InterfaceC3865f6.OooOOOO;
                c4529x4OooO0O0.OooO0o(str, boolValueOf);
                return;
            case R.id.setting_swtich_volume_key_ctrl /* 2131297270 */:
                if (z || this.OooooOo.isChecked()) {
                    c4529x4OooO0O0 = C4529x4.OooO0O0();
                    boolValueOf = Boolean.valueOf(z);
                    str = InterfaceC3865f6.OooOO0o;
                    c4529x4OooO0O0.OooO0o(str, boolValueOf);
                    return;
                }
                this.OoooOoO.OooOO0(R.string.setting_illegal);
                r3 = this.OooooO0;
                break;
            case R.id.setting_swtich_waggle_stop /* 2131297271 */:
                c4529x4OooO0O0 = C4529x4.OooO0O0();
                boolValueOf = Boolean.valueOf(z);
                str = InterfaceC3865f6.OooOOO0;
                c4529x4OooO0O0.OooO0o(str, boolValueOf);
                return;
            default:
                switch (id) {
                    case R.id.switch_setting_automatically_run_script /* 2131297306 */:
                        c4529x4OooO0O0 = C4529x4.OooO0O0();
                        boolValueOf = Boolean.valueOf(z);
                        str = InterfaceC3865f6.OooOo0O;
                        break;
                    case R.id.switch_setting_collect_logcat /* 2131297307 */:
                        C4529x4.OooO0O0().OooO0o(InterfaceC3865f6.OooOOo, Boolean.valueOf(z));
                        if (z) {
                            new DialogC4235p6(getContext()).show();
                            return;
                        }
                        return;
                    case R.id.switch_setting_error_dialog /* 2131297308 */:
                        c4529x4OooO0O0 = C4529x4.OooO0O0();
                        boolValueOf = Boolean.valueOf(z);
                        str = InterfaceC3865f6.OooOOoo;
                        break;
                    case R.id.switch_setting_flash_back_auto_restart /* 2131297309 */:
                        c4529x4OooO0O0 = C4529x4.OooO0O0();
                        boolValueOf = Boolean.valueOf(z);
                        str = InterfaceC3865f6.OooOo0;
                        break;
                    default:
                        return;
                }
                c4529x4OooO0O0.OooO0o(str, boolValueOf);
                return;
        }
        r3.setChecked(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.setting_button_exitapp /* 2131297262 */:
                this.o00o0O = false;
                Context context = this.o00Ooo;
                if (context != null && (context instanceof Activity)) {
                    ((Activity) context).finish();
                }
                C3951hi.OooO0O0();
                Process.killProcess(Process.myPid());
                ActivityManager activityManager = (ActivityManager) getContext().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                if (activityManager != null) {
                    activityManager.killBackgroundProcesses("com.cyjh.elfin:download_server");
                }
                break;
            case R.id.setting_button_scriptlog /* 2131297263 */:
                File[] fileArrListFiles = new File(C3939h6.OooO0O0).listFiles(new C4048k4.OooO00o(".log"));
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    this.OoooOoO.OooOO0(R.string.No_ScriptLog);
                } else {
                    Arrays.sort(fileArrListFiles, new C4348s8());
                    File file = fileArrListFiles[0];
                    ScriptLog scriptLog = new ScriptLog();
                    scriptLog.setName(file.getName());
                    scriptLog.setSize(C4048k4.OooO0Oo(file.length()));
                    scriptLog.setFile(file);
                    Intent intent = new Intent(getContext(), (Class<?>) ScriptLogDetailActivity.class);
                    intent.putExtra(InterfaceC3865f6.OooOoO, true);
                    intent.putExtra(InterfaceC3865f6.OooOoOO, scriptLog);
                    intent.addFlags(268435456);
                    getContext().startActivity(intent);
                    this.o00o0O = true;
                    dismiss();
                }
                break;
            case R.id.setting_button_update /* 2131297264 */:
                OooO();
                break;
            case R.id.setting_dialog_imageview_back /* 2131297265 */:
                this.o00o0O = false;
                dismiss();
                new ViewOnClickListenerC4383t6(getContext()).show();
                break;
        }
    }

    @Override // p285z2.DialogC4423u9, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.setting_dialog);
        OooO0O0(0.1f);
        OooO0Oo(0.9f, 0.6f);
        OooO0oO();
    }
}
