package p285z2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.cyjh.mobileanjian.ipc.p201ui.EnumC2696m;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.cyjh.mobileanjian.ipc.view.ExToast;
import com.cyjh.mqsdk.C2703R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.p284io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.ye */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC4576ye implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private static final int Oooooo = 32;
    private static final String Oooooo0 = "^#*([0-9A-Fa-f]{6})|([0-9A-Fa-f]{3})";
    private Context Ooooo00;
    public C4502we Ooooo0o;
    public C4613ze[] OoooOoO = new C4613ze[32];
    public int OoooOoo = 0;
    public HashMap<String, Integer> OooooO0 = new HashMap<>();
    public HashMap[] OooooOO = new HashMap[32];
    public int OooooOo = 1;

    /* JADX INFO: renamed from: z2.ye$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public final /* synthetic */ String OoooOoO;

        public OooO00o(String str) {
            this.OoooOoO = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C3759cb.OooO0OO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setIsSuccess(true).setEvent(UiMessage.ControlEvent.newBuilder().setControlId(this.OoooOoO).setType(UiMessage.ControlEvent.Event_Type.ON_CLOSE_CONTINUE).build()).build().toByteString());
        }
    }

    /* JADX INFO: renamed from: z2.ye$OooO0O0 */
    public class OooO0O0 implements View.OnClickListener {
        public final /* synthetic */ String OoooOoO;

        public OooO0O0(String str) {
            this.OoooOoO = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            UiMessage.UiToCommand uiToCommandBuild = UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setEvent(UiMessage.ControlEvent.newBuilder().setControlId(this.OoooOoO).setType(UiMessage.ControlEvent.Event_Type.ON_CLOSE_EXIT).build()).setIsSuccess(true).build();
            C3759cb.OooO0OO(uiToCommandBuild.toByteString());
            new StringBuilder("exit event: ").append(uiToCommandBuild);
        }
    }

    /* JADX INFO: renamed from: z2.ye$OooO0OO */
    public static /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] OooO00o;
        public static final /* synthetic */ int[] OooO0O0;

        static {
            int[] iArr = new int[EnumC2696m.values().length];
            OooO0O0 = iArr;
            try {
                iArr[EnumC2696m.TEXT_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OooO0O0[EnumC2696m.EDIT_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OooO0O0[EnumC2696m.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OooO0O0[EnumC2696m.CHECK_BOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OooO0O0[EnumC2696m.RADIIO_GROUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OooO0O0[EnumC2696m.SPINNER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[UiMessage.CommandToUi.Command_Type.values().length];
            OooO00o = iArr2;
            try {
                iArr2[UiMessage.CommandToUi.Command_Type.SAVE_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.LOAD_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.NEW_LAYOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SHOW_LAYOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.CLOSE_LAYOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.CLOSE_CONTINUE_ACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.CLOSE_EXIT_ACK.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.NEW_ROW.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_TITLE_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_TITLE_TEXT.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_TITLE_BACKCOLOR.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_LINE.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_TEXT_VIEW.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_EDIT_TEXT.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_BUTTON.ordinal()] = 15;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_RADIO_GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_CHECK_BOX.ordinal()] = 17;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_IMAGE_VIEW.ordinal()] = 18;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_WEB_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_SPINNER.ordinal()] = 20;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_TAB_HOST.ordinal()] = 21;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_TAB.ordinal()] = 22;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_TEXT_VIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_EDIT_TEXT.ordinal()] = 24;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_BOTTON.ordinal()] = 25;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_CHECK_BOX.ordinal()] = 26;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_IMAGE_VIEW.ordinal()] = 27;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_WEB_VIEW.ordinal()] = 28;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_RADIO_GROUP.ordinal()] = 29;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_SPINNER.ordinal()] = 30;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_ENABLED.ordinal()] = 31;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_LINE.ordinal()] = 32;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_VISIBLE.ordinal()] = 33;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FULLSCREEN.ordinal()] = 34;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_TEXT.ordinal()] = 35;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FONT.ordinal()] = 36;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_EDIT_INPUT_TYPE.ordinal()] = 37;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_TEXT.ordinal()] = 38;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_TEXTCOLOR.ordinal()] = 39;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_BACKCOLOR.ordinal()] = 40;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_VALUE.ordinal()] = 41;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_ENABLED.ordinal()] = 42;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_VISIBLE.ordinal()] = 43;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_TEXTCOLOR.ordinal()] = 44;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_BACKCOLOR.ordinal()] = 45;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_CONTROL_GRAVITY.ordinal()] = 46;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_WINDOW_GRAVITY.ordinal()] = 47;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_PADDING.ordinal()] = 48;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.NEW_FLOAT.ordinal()] = 49;
            } catch (NoSuchFieldError unused55) {
            }
        }
    }

    /* JADX INFO: renamed from: z2.ye$OooO0o */
    public class OooO0o implements TextWatcher {
        private String OoooOoO;

        public OooO0o(String str) {
            this.OoooOoO = str;
        }

        private String OooO00o() {
            return this.OoooOoO;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            C3759cb.OooO0OO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setEvent(UiMessage.ControlEvent.newBuilder().setControlId(this.OoooOoO).setType(UiMessage.ControlEvent.Event_Type.ON_CHANGE).build()).setIsSuccess(true).build().toByteString());
            ViewOnClickListenerC4576ye.this.OoooOoO[ViewOnClickListenerC4576ye.this.OoooOoo].OooOOO();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public ViewOnClickListenerC4576ye(Context context) {
        this.Ooooo00 = context;
        this.Ooooo0o = C4502we.OooOO0o(context);
    }

    private void OooO0Oo(String str, int i, int i2) {
        int i3 = this.OoooOoo + 1;
        this.OoooOoo = i3;
        this.OoooOoO[i3] = this.Ooooo0o.OooOOOO(str, i, i2);
        this.OooooO0.put(str, Integer.valueOf(this.OoooOoo));
        this.OooooOO[this.OoooOoo] = new HashMap();
        this.OoooOoO[this.OoooOoo].OooO0oO = new OooO00o(str);
        this.OoooOoO[this.OoooOoo].OooO0o = new OooO0O0(str);
    }

    public static void OooO0o0(boolean z) {
        C3759cb.OooO00o(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(z).build().toByteString());
    }

    private boolean OooO0oO(String str, String str2) {
        if (this.OooooO0.get(str) == null) {
            OooO0O0(C2703R.string.ui_show_not_found_ui, str);
            return false;
        }
        this.OoooOoO[this.OooooO0.get(str).intValue()].OooO0oo(str2);
        return true;
    }

    public static void OooOOOO(String str) {
        C3759cb.OooO0OO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setIsSuccess(true).setEvent(UiMessage.ControlEvent.newBuilder().setControlId(str).setType(UiMessage.ControlEvent.Event_Type.ON_CLOSE_CONTINUE).build()).build().toByteString());
    }

    private void OooOOOo() {
        OooOOO0();
        this.OoooOoo = 0;
        this.OooooOo = 1;
        for (int i = 0; i < 32; i++) {
            this.OoooOoO[i] = null;
            HashMap[] mapArr = this.OooooOO;
            if (mapArr[i] != null) {
                mapArr[i].clear();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void OooOOo0(com.cyjh.mobileanjian.ipc.share.proto.UiMessage.CommandToUi r10) {
        /*
            Method dump skipped, instruction units count: 2486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.ViewOnClickListenerC4576ye.OooOOo0(com.cyjh.mobileanjian.ipc.share.proto.UiMessage$CommandToUi):void");
    }

    private void OooOOoo(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooO0o0(false);
            return;
        }
        String controlId = commandToUi.getControlId();
        commandToUi.getText();
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
        if (viewOooOOO0 == null) {
            OooO0o0(false);
        } else if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.EDIT_TEXT) {
            OooO0o0(false);
        } else {
            ((EditText) viewOooOOO0).setInputType(commandToUi.getEditInputType());
            OooO0o0(true);
        }
    }

    private void OooOo(String str) {
        C4613ze[] c4613zeArr = this.OoooOoO;
        int i = this.OoooOoo;
        if (c4613zeArr[i] == null) {
            OooO0o0(false);
            return;
        }
        View viewOooOOO0 = c4613zeArr[i].OooOOO0(str);
        if (viewOooOOO0 == null) {
            OooO0o0(false);
            return;
        }
        boolean zIsEnabled = viewOooOOO0.isEnabled();
        if (this.OooooOO[this.OoooOoo].get(str) == EnumC2696m.EDIT_TEXT) {
            zIsEnabled = ((EditText) viewOooOOO0).isFocusable();
        }
        C3759cb.OooO00o(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(str).setType(UiMessage.ControlVar.Data_Type.BOOL).setBoolValue(zIsEnabled).build()).build().toByteString());
    }

    private void OooOo0(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooO0o0(false);
            return;
        }
        String controlId = commandToUi.getControlId();
        String color = commandToUi.getColor();
        if (!color.matches(Oooooo0)) {
            OooO0O0(C2703R.string.ui_show_invalid_color_value, new Object[0]);
            OooO0o0(false);
            return;
        }
        if (!color.startsWith("#")) {
            color = "#".concat(String.valueOf(color));
        }
        int iOooO00o = C3948hf.OooO00o(Color.parseColor(color));
        if (this.OooooO0.get(controlId) != null) {
            this.OoooOoO[this.OooooO0.get(controlId).intValue()].OooO0OO(iOooO00o);
            OooO0o0(true);
            return;
        }
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
        if (viewOooOOO0 == null) {
            OooO0o0(false);
            return;
        }
        switch (OooO0OO.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(controlId)).ordinal()]) {
            case 1:
            case 2:
            case 3:
                ((TextView) viewOooOOO0).setTextColor(iOooO00o);
                break;
            case 4:
                ((CheckBox) viewOooOOO0).setTextColor(iOooO00o);
                break;
            case 5:
                RadioButton radioButton = (RadioButton) ((RadioGroup) viewOooOOO0).findViewById(commandToUi.getItemIndex());
                if (radioButton == null) {
                    OooO0o0(false);
                    return;
                }
                radioButton.setTextColor(iOooO00o);
                break;
            case 6:
                if (commandToUi.getItemIndex() >= ((Spinner) viewOooOOO0).getCount()) {
                    OooO0o0(false);
                    return;
                }
                break;
            default:
                OooO0o0(false);
                return;
        }
        OooO0o0(true);
    }

    private void OooOo0O(String str) {
        if (this.OooooO0.get(str) != null) {
            OooO0o0(true);
            return;
        }
        if (this.OooooOO[this.OoooOoo].get(str) == null) {
            OooO0o0(false);
            return;
        }
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(str);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewOooOOO0.getLayoutParams();
        layoutParams.width = -1;
        viewOooOOO0.setLayoutParams(layoutParams);
    }

    private void OooOo0o(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooO0o0(false);
            return;
        }
        String controlId = commandToUi.getControlId();
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
        if (viewOooOOO0 == null) {
            OooO0o0(false);
            return;
        }
        String color = commandToUi.getColor();
        if (!color.matches(Oooooo0)) {
            OooO0O0(C2703R.string.ui_show_invalid_color_value, new Object[0]);
            OooO0o0(false);
            return;
        }
        if (!color.startsWith("#")) {
            color = "#".concat(String.valueOf(color));
        }
        int iOooO00o = C3948hf.OooO00o(Color.parseColor(color));
        if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.BUTTON) {
            if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.SPINNER) {
                viewOooOOO0.setBackgroundColor(iOooO00o);
            }
            OooO0o0(true);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iOooO00o);
        gradientDrawable.setCornerRadius(OooO());
        if (Build.VERSION.SDK_INT >= 16) {
            viewOooOOO0.setBackground(gradientDrawable);
        } else {
            viewOooOOO0.setBackgroundDrawable(gradientDrawable);
        }
        OooO0o0(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void OooOoO(java.lang.String r5) {
        /*
            r4 = this;
            z2.ze[] r0 = r4.OoooOoO
            int r1 = r4.OoooOoo
            r2 = r0[r1]
            r3 = 0
            if (r2 != 0) goto Ld
            OooO0o0(r3)
            return
        Ld:
            r0 = r0[r1]
            android.view.View r0 = r0.OooOOO0(r5)
            if (r0 != 0) goto L19
            OooO0o0(r3)
            return
        L19:
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == 0) goto L27
            r2 = 4
            if (r0 == r2) goto L2b
            r2 = 8
            if (r0 == r2) goto L29
        L27:
            r0 = 1
            goto L2c
        L29:
            r0 = 3
            goto L2c
        L2b:
            r0 = 2
        L2c:
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$ControlVar$Builder r2 = com.cyjh.mobileanjian.ipc.share.proto.UiMessage.ControlVar.newBuilder()
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$ControlVar$Builder r5 = r2.setControlId(r5)
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$ControlVar$Data_Type r2 = com.cyjh.mobileanjian.ipc.share.proto.UiMessage.ControlVar.Data_Type.INT
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$ControlVar$Builder r5 = r5.setType(r2)
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$ControlVar$Builder r5 = r5.setIntValue(r0)
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$ControlVar r5 = r5.build()
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$UiToCommand$Builder r0 = com.cyjh.mobileanjian.ipc.share.proto.UiMessage.UiToCommand.newBuilder()
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$UiToCommand$Command_Type r2 = com.cyjh.mobileanjian.ipc.share.proto.UiMessage.UiToCommand.Command_Type.RSP_MSG
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$UiToCommand$Builder r0 = r0.setCommand(r2)
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$UiToCommand$Builder r0 = r0.setIsSuccess(r1)
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$UiToCommand$Builder r5 = r0.addVarTable(r5)
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$UiToCommand r5 = r5.build()
            com.google.protobuf.ByteString r5 = r5.toByteString()
            p285z2.C3759cb.OooO00o(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.ViewOnClickListenerC4576ye.OooOoO(java.lang.String):void");
    }

    private void OooOoO0(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooO0o0(false);
            return;
        }
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(commandToUi.getControlId());
        if (viewOooOOO0 == null) {
            OooO0o0(false);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewOooOOO0.getLayoutParams();
        layoutParams.gravity = commandToUi.getAlignType();
        viewOooOOO0.setLayoutParams(layoutParams);
        new StringBuilder("set gravity ok; ").append(layoutParams);
        OooO0o0(true);
    }

    private void OooOoOO(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooO0o0(false);
            return;
        }
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(commandToUi.getControlId());
        if (viewOooOOO0 == null) {
            OooO0o0(false);
            return;
        }
        UiMessage.Padding_Var padding = commandToUi.getPadding();
        new StringBuilder("padding: ").append(padding.getLeft());
        new StringBuilder("padding: ").append(padding.getTop());
        new StringBuilder("padding: ").append(padding.getRight());
        new StringBuilder("padding: ").append(padding.getBottom());
        viewOooOOO0.setPadding(padding.getLeft(), padding.getTop(), padding.getRight(), padding.getBottom());
        OooO0o0(true);
    }

    private void OooOoo(UiMessage.CommandToUi commandToUi) {
        TextPaint paint;
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooO0o0(false);
            return;
        }
        String controlId = commandToUi.getControlId();
        if (this.OooooOO[this.OoooOoo].get(controlId) == null) {
            OooO0o0(false);
            return;
        }
        int i = OooO0OO.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(controlId)).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            paint = ((TextView) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).getPaint();
        } else if (i == 4) {
            paint = ((CheckBox) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).getPaint();
        } else {
            if (i != 5) {
                OooO0o0(false);
                return;
            }
            RadioButton radioButton = (RadioButton) ((RadioGroup) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).findViewById(commandToUi.getItemIndex());
            if (radioButton == null) {
                OooO0o0(false);
                return;
            }
            paint = radioButton.getPaint();
        }
        int color = paint.getColor();
        C3759cb.OooO00o(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(controlId).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(String.format("%02X%02X%02X", Integer.valueOf(Color.blue(color)), Integer.valueOf(Color.green(color)), Integer.valueOf(Color.red(color)))).build()).build().toByteString());
    }

    private void OooOoo0(String str) {
        C4613ze[] c4613zeArr = this.OoooOoO;
        int i = this.OoooOoo;
        if (c4613zeArr[i] == null) {
            OooO0o0(false);
            return;
        }
        View viewOooOOO0 = c4613zeArr[i].OooOOO0(str);
        if (viewOooOOO0 == null) {
            OooO0o0(false);
            return;
        }
        C3759cb.OooO00o(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(str).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue("#" + Integer.toHexString(C3948hf.OooO00o(viewOooOOO0.getSolidColor()) & ViewCompat.MEASURED_SIZE_MASK)).build()).build().toByteString());
    }

    private void OooOooO(String str) {
        if (this.OooooO0.get(str) == null) {
            OooO0O0(C2703R.string.ui_show_not_found_ui, str);
            OooO0o0(false);
        } else {
            if (this.OoooOoO[this.OooooO0.get(str).intValue()].OooOOo0) {
                OooO0o0(false);
                return;
            }
            this.OoooOoO[this.OooooO0.get(str).intValue()].OooOOoo();
            OooO0o0(true);
            C3759cb.OooO0OO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setIsSuccess(true).setEvent(UiMessage.ControlEvent.newBuilder().setControlId(str).setType(UiMessage.ControlEvent.Event_Type.ON_SHOW).build()).build().toByteString());
        }
    }

    private void OooOooo(UiMessage.CommandToUi commandToUi) {
        CharSequence text;
        String string;
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooO0o0(false);
        }
        String controlId = commandToUi.getControlId();
        if (this.OooooOO[this.OoooOoo].get(controlId) == null) {
            OooO0o0(false);
            return;
        }
        switch (OooO0OO.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(controlId)).ordinal()]) {
            case 1:
            case 2:
            case 3:
                text = ((TextView) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).getText();
                string = text.toString();
                C3759cb.OooO00o(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(controlId).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(string).build()).build().toByteString());
                break;
            case 4:
                text = ((CheckBox) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).getText();
                string = text.toString();
                C3759cb.OooO00o(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(controlId).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(string).build()).build().toByteString());
                break;
            case 5:
                RadioButton radioButton = (RadioButton) ((RadioGroup) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).findViewById(commandToUi.getItemIndex());
                if (radioButton != null) {
                    text = radioButton.getText();
                    string = text.toString();
                    C3759cb.OooO00o(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(controlId).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(string).build()).build().toByteString());
                } else {
                    OooO0o0(false);
                }
                break;
            case 6:
                Spinner spinner = (Spinner) this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
                if (commandToUi.getItemIndex() < spinner.getCount()) {
                    new StringBuilder("Spinner Get pos: ").append(spinner.getItemAtPosition(commandToUi.getItemIndex()));
                    string = (String) spinner.getItemAtPosition(commandToUi.getItemIndex());
                    C3759cb.OooO00o(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(controlId).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(string).build()).build().toByteString());
                } else {
                    OooO0o0(false);
                }
                break;
            default:
                OooO0o0(false);
                break;
        }
    }

    private void Oooo000(String str) {
        if (this.OooooO0.get(str) != null) {
            C3759cb.OooO00o(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(str).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(this.OoooOoO[this.OooooO0.get(str).intValue()].OooO0O0()).build()).build().toByteString());
        } else {
            OooO0O0(C2703R.string.ui_show_not_found_ui, str);
            OooO0o0(false);
        }
    }

    private void Oooo00O(UiMessage.CommandToUi commandToUi) {
        String controlId = commandToUi.getControlId();
        String color = commandToUi.getColor();
        if (this.OooooO0.get(controlId) == null) {
            OooO0O0(C2703R.string.ui_show_not_found_ui, controlId);
            OooO0o0(false);
        } else {
            if (!color.matches(Oooooo0)) {
                OooO0O0(C2703R.string.ui_show_invalid_color_value, new Object[0]);
                OooO0o0(false);
                return;
            }
            if (!color.startsWith("#")) {
                color = "#".concat(String.valueOf(color));
            }
            this.OoooOoO[this.OooooO0.get(controlId).intValue()].OooOOOO(C3948hf.OooO00o(Color.parseColor(color)));
            OooO0o0(true);
        }
    }

    public final int OooO() {
        return (int) ((this.Ooooo00.getResources().getDisplayMetrics().densityDpi / 160.0f) * 5.0f);
    }

    public final int OooO00o() {
        int i = this.OooooOo + 1;
        this.OooooOo = i;
        return i;
    }

    public final void OooO0O0(int i, Object... objArr) {
        Context context = this.Ooooo00;
        ExToast.makeText(context, String.format(context.getString(i), objArr), ExToast.LENGTH_LONG).show();
    }

    public final void OooO0OO(String str) throws JSONException, IOException {
        if (this.OoooOoO[this.OoooOoo] == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.OooooOO[this.OoooOoo].entrySet()) {
            String str2 = (String) entry.getKey();
            int i = OooO0OO.OooO0O0[((EnumC2696m) entry.getValue()).ordinal()];
            if (i == 2) {
                jSONObject.put(str2, ((EditText) this.OoooOoO[this.OoooOoo].OooOOO0(str2)).getText().toString());
            } else if (i == 4) {
                jSONObject.put(str2, ((CheckBox) this.OoooOoO[this.OoooOoo].OooOOO0(str2)).isChecked());
            } else if (i == 5) {
                jSONObject.put(str2, ((RadioGroup) this.OoooOoO[this.OoooOoo].OooOOO0(str2)).getCheckedRadioButtonId());
            } else if (i == 6) {
                jSONObject.put(str2, ((Spinner) this.OoooOoO[this.OoooOoo].OooOOO0(str2)).getSelectedItemId());
            }
        }
        FileUtils.writeStringToFile(new File(str), jSONObject.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean OooO0o(UiMessage.CommandToUi commandToUi) {
        int i;
        if (this.OoooOoO[this.OoooOoo] == null) {
            return false;
        }
        String controlId = commandToUi.getControlId();
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
        if (viewOooOOO0 == null) {
            OooO0O0(C2703R.string.ui_show_not_found_widget, controlId);
            return false;
        }
        switch (OooO0OO.OooO00o[commandToUi.getCommand().ordinal()]) {
            case 23:
                if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.TEXT_VIEW) {
                    return false;
                }
                TextView textView = (TextView) viewOooOOO0;
                textView.setText(commandToUi.getText());
                textView.setLayoutParams(new LinearLayout.LayoutParams(commandToUi.getWidth(), commandToUi.getHeight()));
                return true;
            case 24:
                if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.EDIT_TEXT) {
                    return false;
                }
                EditText editText = (EditText) viewOooOOO0;
                editText.setText(commandToUi.getText());
                editText.setLayoutParams(new LinearLayout.LayoutParams(commandToUi.getWidth(), commandToUi.getHeight()));
                return true;
            case 25:
                if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.BUTTON) {
                    return false;
                }
                Button button = (Button) viewOooOOO0;
                button.setText(commandToUi.getText());
                button.setLayoutParams(new LinearLayout.LayoutParams(commandToUi.getWidth(), commandToUi.getHeight()));
                return true;
            case 26:
                if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.CHECK_BOX) {
                    return false;
                }
                CheckBox checkBox = (CheckBox) viewOooOOO0;
                checkBox.setChecked(commandToUi.getDefaultCheckStatus());
                checkBox.setText(commandToUi.getText());
                checkBox.getLayoutParams().width = commandToUi.getWidth();
                checkBox.getLayoutParams().height = commandToUi.getHeight();
                return true;
            case 27:
                if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.IMAGE_VIEW) {
                    return false;
                }
                ImageView imageView = (ImageView) viewOooOOO0;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewOooOOO0.getLayoutParams();
                layoutParams.width = commandToUi.getWidth();
                layoutParams.height = commandToUi.getHeight();
                imageView.setLayoutParams(layoutParams);
                imageView.setImageURI(Uri.fromFile(new File(commandToUi.getPath())));
                return true;
            case 28:
                if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.WEB_VIEW) {
                    return false;
                }
                String url = commandToUi.getUrl();
                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "http://".concat(String.valueOf(url));
                }
                WebView webView = (WebView) viewOooOOO0;
                webView.loadUrl(url);
                webView.setLayoutParams(new LinearLayout.LayoutParams(commandToUi.getWidth(), commandToUi.getHeight()));
                return true;
            case 29:
                if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.RADIIO_GROUP) {
                    return false;
                }
                RadioGroup radioGroup = (RadioGroup) viewOooOOO0;
                radioGroup.clearCheck();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewOooOOO0.getLayoutParams();
                layoutParams2.weight = commandToUi.getWidth();
                layoutParams2.height = commandToUi.getHeight();
                radioGroup.setLayoutParams(layoutParams2);
                radioGroup.removeAllViews();
                List<String> itemTextList = commandToUi.getItemTextList();
                for (int i2 = 0; i2 < itemTextList.size(); i2++) {
                    RadioButton radioButton = (RadioButton) LayoutInflater.from(this.Ooooo00).inflate(C2703R.layout.ui_show_radio_button, (ViewGroup) null);
                    radioButton.setId(i2);
                    radioButton.setText(itemTextList.get(i2));
                    radioButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    radioButton.setPadding(0, OooO(), 0, OooO());
                    radioGroup.addView(radioButton);
                }
                ((RadioButton) radioGroup.findViewById(commandToUi.getDefaultItemIndex() < radioGroup.getChildCount() ? commandToUi.getDefaultItemIndex() : 0)).setChecked(true);
                return true;
            case 30:
                if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.SPINNER) {
                    return false;
                }
                Spinner spinner = (Spinner) viewOooOOO0;
                ArrayAdapter arrayAdapter = new ArrayAdapter(this.Ooooo00, C2703R.layout.ui_show_spinner_dropdown_item, commandToUi.getItemTextList());
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                spinner.setSelection(commandToUi.getDefaultItemIndex() < arrayAdapter.getCount() ? commandToUi.getDefaultItemIndex() : 0);
                return true;
            case 31:
                if (this.OooooOO[this.OoooOoo].get(controlId) == EnumC2696m.RADIIO_GROUP) {
                    viewOooOOO0.setEnabled(commandToUi.getEnabledStatus());
                    RadioGroup radioGroup2 = (RadioGroup) viewOooOOO0;
                    while (i < radioGroup2.getChildCount()) {
                        radioGroup2.getChildAt(i).setEnabled(commandToUi.getEnabledStatus());
                        i++;
                    }
                } else if (this.OooooOO[this.OoooOoo].get(controlId) == EnumC2696m.EDIT_TEXT) {
                    new StringBuilder("set edittext enabled. ").append(commandToUi.getEnabledStatus());
                    EditText editText2 = (EditText) viewOooOOO0;
                    editText2.setFocusable(commandToUi.getEnabledStatus());
                    editText2.setFocusableInTouchMode(commandToUi.getEnabledStatus());
                } else {
                    viewOooOOO0.setEnabled(commandToUi.getEnabledStatus());
                }
                return true;
            case 32:
                if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.LINE) {
                    return false;
                }
                ((LinearLayout) viewOooOOO0).setLayoutParams(new LinearLayout.LayoutParams(commandToUi.getWidth(), commandToUi.getHeight()));
                return true;
            case 33:
                int visibleStatus = commandToUi.getVisibleStatus();
                if (visibleStatus == 2) {
                    i = 4;
                } else {
                    if (visibleStatus != 3) {
                        viewOooOOO0.setVisibility(0);
                        return true;
                    }
                    i = 8;
                }
                viewOooOOO0.setVisibility(i);
                return true;
            default:
                return true;
        }
    }

    public final void OooOO0O(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooO0o0(false);
            return;
        }
        new StringBuilder("SET FONT type: ").append(commandToUi.getFontType());
        String controlId = commandToUi.getControlId();
        Typeface typefaceCreate = Typeface.create(commandToUi.getFontType(), 0);
        if (typefaceCreate == null) {
            OooO0o0(false);
            return;
        }
        int fontSize = commandToUi.getFontSize() < 0 ? 14 : commandToUi.getFontSize();
        if (this.OooooO0.get(controlId) != null && this.OoooOoO[this.OooooO0.get(controlId).intValue()] != null) {
            this.OoooOoO[this.OooooO0.get(controlId).intValue()].OooO0o0(typefaceCreate, fontSize);
            OooO0o0(true);
            return;
        }
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
        if (viewOooOOO0 == null) {
            OooO0o0(false);
            return;
        }
        if (this.OooooOO[this.OoooOoo].get(controlId) == null) {
            OooO0o0(false);
            return;
        }
        int i = OooO0OO.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(controlId)).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            TextView textView = (TextView) viewOooOOO0;
            textView.setTypeface(typefaceCreate);
            textView.setTextSize(2, fontSize);
        } else if (i == 4) {
            CheckBox checkBox = (CheckBox) viewOooOOO0;
            checkBox.setTypeface(typefaceCreate);
            checkBox.setTextSize(2, fontSize);
        } else {
            if (i != 5) {
                OooO0o0(false);
                return;
            }
            RadioGroup radioGroup = (RadioGroup) viewOooOOO0;
            radioGroup.findViewById(commandToUi.getItemIndex());
            for (int i2 = 0; i2 < radioGroup.getChildCount(); i2++) {
                RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i2);
                radioButton.setTypeface(typefaceCreate);
                radioButton.setTextSize(2, fontSize);
            }
        }
        OooO0o0(true);
    }

    public final void OooOO0o(String str) throws JSONException, IOException {
        if (this.OooooOO[this.OoooOoo] == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(FileUtils.readFileToString(new File(str)));
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (this.OooooOO[this.OoooOoo].get(next) != null) {
                int i = OooO0OO.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(next)).ordinal()];
                if (i == 2) {
                    ((EditText) this.OoooOoO[this.OoooOoo].OooOOO0(next)).setText(jSONObject.getString(next));
                } else if (i == 4) {
                    ((CheckBox) this.OoooOoO[this.OoooOoo].OooOOO0(next)).setChecked(jSONObject.getBoolean(next));
                } else if (i == 5) {
                    RadioGroup radioGroup = (RadioGroup) this.OoooOoO[this.OoooOoo].OooOOO0(next);
                    if (jSONObject.getInt(next) < radioGroup.getChildCount()) {
                        ((RadioButton) radioGroup.findViewById(jSONObject.getInt(next))).setChecked(true);
                    }
                } else if (i == 6) {
                    Spinner spinner = (Spinner) this.OoooOoO[this.OoooOoo].OooOOO0(next);
                    if (jSONObject.getInt(next) < spinner.getCount()) {
                        spinner.setSelection(jSONObject.getInt(next));
                    }
                }
            }
        }
    }

    public final void OooOOO(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooO0o0(false);
            return;
        }
        String controlId = commandToUi.getControlId();
        String text = commandToUi.getText();
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
        if (viewOooOOO0 == null) {
            OooO0o0(false);
            return;
        }
        if (this.OooooOO[this.OoooOoo].get(controlId) == null) {
            OooO0o0(false);
            return;
        }
        switch (OooO0OO.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(controlId)).ordinal()]) {
            case 1:
            case 2:
            case 3:
                ((TextView) viewOooOOO0).setText(text);
                break;
            case 4:
                ((CheckBox) viewOooOOO0).setText(text);
                break;
            case 5:
                RadioButton radioButton = (RadioButton) ((RadioGroup) viewOooOOO0).findViewById(commandToUi.getItemIndex());
                if (radioButton == null) {
                    OooO0o0(false);
                    return;
                }
                radioButton.setText(text);
                break;
            case 6:
                Spinner spinner = (Spinner) viewOooOOO0;
                if (commandToUi.getItemIndex() >= spinner.getCount()) {
                    OooO0o0(false);
                    return;
                }
                ArrayAdapter arrayAdapter = (ArrayAdapter) spinner.getAdapter();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < arrayAdapter.getCount(); i++) {
                    arrayList.add((String) arrayAdapter.getItem(i));
                }
                arrayList.set(commandToUi.getItemIndex(), text);
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(this.Ooooo00, C2703R.layout.ui_show_spinner_dropdown_item, arrayList);
                spinner.setAdapter((SpinnerAdapter) arrayAdapter2);
                arrayAdapter2.notifyDataSetChanged();
                break;
                break;
            default:
                OooO0o0(false);
                return;
        }
        OooO0o0(true);
    }

    public final void OooOOO0() {
        for (int i = 31; i > 0; i--) {
            C4613ze c4613ze = this.OoooOoO[i];
            if (c4613ze != null && c4613ze.OooOOo0) {
                c4613ze.OooOo0();
            }
        }
    }

    public final boolean OooOOo(String str) {
        int i;
        if (this.OooooO0.get(str) == null) {
            OooO0O0(C2703R.string.ui_show_not_found_ui, str);
            return false;
        }
        if (!this.OoooOoO[this.OooooO0.get(str).intValue()].OooOOo0) {
            return false;
        }
        this.OoooOoO[this.OooooO0.get(str).intValue()].OooOo0();
        int iIntValue = this.OooooO0.get(str).intValue();
        int i2 = this.OoooOoo;
        if (iIntValue == i2) {
            this.OoooOoo = i2 - 1;
            while (true) {
                i = this.OoooOoo;
                if (i <= 0 || this.OoooOoO[i] != null) {
                    break;
                }
                this.OoooOoo = i - 1;
            }
            if (i < 0) {
                this.OoooOoo = 0;
            }
        }
        return true;
    }

    public final void OooOo00(String str) {
        UiMessage.ControlVar.Builder type;
        int checkedRadioButtonId;
        UiMessage.UiToCommand uiToCommandBuild;
        UiMessage.UiToCommand.Builder isSuccess = UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true);
        UiMessage.ControlVar.Builder controlId = UiMessage.ControlVar.newBuilder().setControlId(str);
        EnumC2696m enumC2696m = null;
        int i = 0;
        while (true) {
            if (i >= 32) {
                i = 0;
                break;
            }
            HashMap[] mapArr = this.OooooOO;
            if (mapArr[i] != null && (enumC2696m = (EnumC2696m) mapArr[i].get(str)) != null) {
                break;
            } else {
                i++;
            }
        }
        StringBuilder sb = new StringBuilder("type=");
        sb.append(enumC2696m);
        sb.append("; tempIndex=");
        sb.append(i);
        if (enumC2696m == null) {
            OooO0O0(C2703R.string.ui_show_not_found_widget, str);
            uiToCommandBuild = isSuccess.setIsSuccess(false).build();
        } else {
            switch (OooO0OO.OooO0O0[enumC2696m.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    controlId.setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(((TextView) this.OoooOoO[i].OooOOO0(str)).getText().toString());
                    isSuccess.addVarTable(controlId.build());
                    break;
                case 4:
                    controlId.setType(UiMessage.ControlVar.Data_Type.BOOL).setBoolValue(((CheckBox) this.OoooOoO[i].OooOOO0(str)).isChecked());
                    isSuccess.addVarTable(controlId.build());
                    break;
                case 5:
                    RadioGroup radioGroup = (RadioGroup) this.OoooOoO[i].OooOOO0(str);
                    type = controlId.setType(UiMessage.ControlVar.Data_Type.INT);
                    checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                    type.setIntValue(checkedRadioButtonId);
                    isSuccess.addVarTable(controlId.build());
                    break;
                case 6:
                    Spinner spinner = (Spinner) this.OoooOoO[i].OooOOO0(str);
                    type = controlId.setType(UiMessage.ControlVar.Data_Type.INT);
                    checkedRadioButtonId = spinner.getSelectedItemPosition();
                    type.setIntValue(checkedRadioButtonId);
                    isSuccess.addVarTable(controlId.build());
                    break;
                default:
                    isSuccess.setIsSuccess(false);
                    break;
            }
            new StringBuilder("Ui.getValue result: ").append(isSuccess.build());
            uiToCommandBuild = isSuccess.build();
        }
        C3759cb.OooO00o(uiToCommandBuild.toByteString());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3759cb.OooO0OO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setEvent(UiMessage.ControlEvent.newBuilder().setControlId((String) view.getTag()).setType(UiMessage.ControlEvent.Event_Type.ON_CLICK).build()).setIsSuccess(true).build().toByteString());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C3759cb.OooO0OO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setEvent(UiMessage.ControlEvent.newBuilder().setControlId((String) adapterView.getTag()).setEventArgs(String.valueOf(i)).setType(UiMessage.ControlEvent.Event_Type.ON_CLICK).build()).setIsSuccess(true).build().toByteString());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
