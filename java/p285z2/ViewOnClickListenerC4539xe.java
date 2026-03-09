package p285z2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
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
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.cyjh.mobileanjian.ipc.p201ui.C2695j;
import com.cyjh.mobileanjian.ipc.p201ui.EnumC2696m;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.cyjh.mobileanjian.ipc.view.ExToast;
import com.cyjh.mqsdk.C2703R;
import com.cyjh.p202mq.sdk.MqRunner;
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

/* JADX INFO: renamed from: z2.xe */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC4539xe implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private static final String o00O0O = "^#*([0-9A-Fa-f]{6})|([0-9A-Fa-f]{3})";
    private static final int o00Oo0 = 32;
    private Context Ooooo00;
    private C4502we Ooooo0o;
    private LinearLayout o0OoOo0;
    public C4613ze[] OoooOoO = new C4613ze[32];
    public int OoooOoo = 0;
    private HashMap<String, Integer> OooooO0 = new HashMap<>();
    public HashMap[] OooooOO = new HashMap[32];
    public C2695j[] OooooOo = new C2695j[32];
    public int Oooooo0 = 0;
    public HashMap<String, Integer> Oooooo = new HashMap<>();
    public HashMap<String, EnumC2696m> OoooooO = new HashMap<>();
    public HashMap<String, String> Ooooooo = new HashMap<>();
    public int ooOO = 1;

    /* JADX INFO: renamed from: z2.xe$OooO */
    public class OooO implements TextWatcher {
        private String OoooOoO;

        public OooO(String str) {
            this.OoooOoO = str;
        }

        private String OooO00o() {
            return this.OoooOoO;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            MqRunner.getInstance().OooO0Oo(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setEvent(UiMessage.ControlEvent.newBuilder().setControlId(this.OoooOoO).setType(UiMessage.ControlEvent.Event_Type.ON_CHANGE).build()).setIsSuccess(true).build().toByteString());
            ViewOnClickListenerC4539xe.this.OoooOoO[ViewOnClickListenerC4539xe.this.OoooOoo].OooOOO();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: z2.xe$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public final /* synthetic */ String OoooOoO;

        public OooO00o(String str) {
            this.OoooOoO = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewOnClickListenerC4539xe.OooO0oo(this.OoooOoO, UiMessage.ControlEvent.Event_Type.ON_CLICK);
        }
    }

    /* JADX INFO: renamed from: z2.xe$OooO0O0 */
    public class OooO0O0 implements View.OnClickListener {
        public final /* synthetic */ String OoooOoO;

        public OooO0O0(String str) {
            this.OoooOoO = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MqRunner.getInstance().OooO0Oo(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setIsSuccess(true).setEvent(UiMessage.ControlEvent.newBuilder().setControlId(this.OoooOoO).setType(UiMessage.ControlEvent.Event_Type.ON_CLOSE_CONTINUE).build()).build().toByteString());
        }
    }

    /* JADX INFO: renamed from: z2.xe$OooO0OO */
    public class OooO0OO implements View.OnClickListener {
        public final /* synthetic */ String OoooOoO;

        public OooO0OO(String str) {
            this.OoooOoO = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            for (int i = 31; i > 0; i--) {
                if (ViewOnClickListenerC4539xe.this.OoooOoO[i] != null) {
                    UiMessage.UiToCommand uiToCommandBuild = UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setEvent(UiMessage.ControlEvent.newBuilder().setControlId(this.OoooOoO).setType(UiMessage.ControlEvent.Event_Type.ON_CLOSE_EXIT).build()).setIsSuccess(true).build();
                    MqRunner.getInstance().OooO0Oo(uiToCommandBuild.toByteString());
                    new StringBuilder("exit event: ").append(uiToCommandBuild);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z2.xe$OooO0o */
    public static /* synthetic */ class OooO0o {
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
            try {
                OooO0O0[EnumC2696m.IMAGE_VIEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[UiMessage.CommandToUi.Command_Type.values().length];
            OooO00o = iArr2;
            try {
                iArr2[UiMessage.CommandToUi.Command_Type.SAVE_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.LOAD_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.NEW_LAYOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SHOW_LAYOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.CLOSE_LAYOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.CLOSE_CONTINUE_ACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.CLOSE_EXIT_ACK.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.NEW_ROW.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_TITLE_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_TITLE_TEXT.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_TITLE_BACKCOLOR.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_LINE.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_TEXT_VIEW.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_EDIT_TEXT.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_BUTTON.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_RADIO_GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_CHECK_BOX.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_IMAGE_VIEW.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_WEB_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_SPINNER.ordinal()] = 20;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_TAB_HOST.ordinal()] = 21;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_TAB.ordinal()] = 22;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_TEXT_VIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_EDIT_TEXT.ordinal()] = 24;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_BOTTON.ordinal()] = 25;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_CHECK_BOX.ordinal()] = 26;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_IMAGE_VIEW.ordinal()] = 27;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_WEB_VIEW.ordinal()] = 28;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_RADIO_GROUP.ordinal()] = 29;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_SPINNER.ordinal()] = 30;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_ENABLED.ordinal()] = 31;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_LINE.ordinal()] = 32;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_VISIBLE.ordinal()] = 33;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FULLSCREEN.ordinal()] = 34;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_TEXT.ordinal()] = 35;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FONT.ordinal()] = 36;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_EDIT_INPUT_TYPE.ordinal()] = 37;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_TEXT.ordinal()] = 38;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_TEXTCOLOR.ordinal()] = 39;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_BACKCOLOR.ordinal()] = 40;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_VALUE.ordinal()] = 41;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_ENABLED.ordinal()] = 42;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_VISIBLE.ordinal()] = 43;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_TEXTCOLOR.ordinal()] = 44;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_BACKCOLOR.ordinal()] = 45;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_CONTROL_GRAVITY.ordinal()] = 46;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_WINDOW_GRAVITY.ordinal()] = 47;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_PADDING.ordinal()] = 48;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.NEW_FLOAT.ordinal()] = 49;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SHOW_FLOAT.ordinal()] = 50;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.IS_FW_TOUCHMOVE.ordinal()] = 51;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.HIDE_FLOAT.ordinal()] = 52;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.CLOSE_FLOAT.ordinal()] = 53;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.FW_OPACITY.ordinal()] = 54;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FW_SMOOTH.ordinal()] = 55;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FW_BG.ordinal()] = 56;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FW_PIC.ordinal()] = 57;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_FW_BUTTON.ordinal()] = 58;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_FW_TEXT_VIEW.ordinal()] = 59;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.ADD_FW_IMAGE_VIEW.ordinal()] = 60;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.FW_ZORDER.ordinal()] = 61;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_COLOR.ordinal()] = 62;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.FW_GET_VALUE.ordinal()] = 63;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FW_BUTTON.ordinal()] = 64;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_VIEW.ordinal()] = 65;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FW_IMAGE_VIEW.ordinal()] = 66;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_SIZE.ordinal()] = 67;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FW_ENABLE.ordinal()] = 68;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.SET_FW_VISIBLE.ordinal()] = 69;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_FW_ENABLE.ordinal()] = 70;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_FW_TEXT_COLOR.ordinal()] = 71;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.GET_FW_VISIBLE.ordinal()] = 72;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.FW_SET_LEFT.ordinal()] = 73;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.FW_SET_TOP.ordinal()] = 74;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.FW_SET_WIDTH.ordinal()] = 75;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.FW_SET_HEIGHT.ordinal()] = 76;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                OooO00o[UiMessage.CommandToUi.Command_Type.FW_SET_TEXT.ordinal()] = 77;
            } catch (NoSuchFieldError unused84) {
            }
        }
    }

    public ViewOnClickListenerC4539xe(Context context) {
        this.Ooooo00 = context;
        this.Ooooo0o = C4502we.OooOO0o(context);
    }

    private void OooO(String str, boolean z) {
        boolean z3 = true;
        if (this.Oooooo.get(str) == null) {
            z3 = false;
            OooO0O0(C2703R.string.ui_show_not_found_float, str);
        } else {
            this.OooooOo[this.Oooooo.get(str).intValue()].OooooOo = z;
        }
        OooOO0(z3);
    }

    private void OooO0O0(int i, Object... objArr) {
        Context context = this.Ooooo00;
        ExToast.makeText(context, String.format(context.getString(i), objArr), ExToast.LENGTH_LONG).show();
    }

    private void OooO0Oo(String str) {
        if (this.OooooO0.get(str) != null) {
            OooOO0(true);
            return;
        }
        if (this.OooooOO[this.OoooOoo].get(str) == null) {
            OooOO0(false);
            return;
        }
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(str);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewOooOOO0.getLayoutParams();
        layoutParams.width = -1;
        viewOooOOO0.setLayoutParams(layoutParams);
    }

    private void OooO0o(String str, int i, int i2) {
        int i3 = this.OoooOoo + 1;
        this.OoooOoo = i3;
        this.OoooOoO[i3] = this.Ooooo0o.OooOOOO(str, i, i2);
        this.OooooO0.put(str, Integer.valueOf(this.OoooOoo));
        this.OooooOO[this.OoooOoo] = new HashMap();
        this.OoooOoO[this.OoooOoo].OooO0oO = new OooO0O0(str);
        this.OoooOoO[this.OoooOoo].OooO0o = new OooO0OO(str);
    }

    private void OooO0o0(String str, int i) {
        boolean z = true;
        if (this.Oooooo.get(str) == null) {
            z = false;
            OooO0O0(C2703R.string.ui_show_not_found_float, str);
        } else {
            this.OooooOo[this.Oooooo.get(str).intValue()].setOpacity(i);
        }
        OooOO0(z);
    }

    private void OooO0oO(String str, int i, int i2, int i3, int i4) {
        if (this.Oooooo.get(str) == null) {
            int i5 = this.Oooooo0 + 1;
            this.Oooooo0 = i5;
            this.OooooOo[i5] = this.Ooooo0o.OooOOO0(str, i, i2, i3, i4);
            this.Oooooo.put(str, Integer.valueOf(this.Oooooo0));
            return;
        }
        if (this.OooooOo[this.Oooooo.get(str).intValue()].OooooOO) {
            this.OooooOo[this.Oooooo.get(str).intValue()].OooOO0();
        }
        Iterator<Map.Entry<String, String>> it = this.Ooooooo.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            StringBuilder sb = new StringBuilder("doNewFloat key:");
            sb.append(key);
            sb.append(" parentTag:");
            sb.append(value);
            sb.append(" tag:");
            sb.append(str);
            if (value.compareTo(str) == 0) {
                it.remove();
                this.OoooooO.remove(key);
            }
        }
        this.OooooOo[this.Oooooo.get(str).intValue()] = this.Ooooo0o.OooOOO0(str, i, i2, i3, i4);
    }

    public static void OooO0oo(String str, UiMessage.ControlEvent.Event_Type event_Type) {
        MqRunner.getInstance().OooO0O0(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setEvent(UiMessage.ControlEvent.newBuilder().setControlId(str).setType(event_Type).build()).setIsSuccess(true).build().toByteString());
    }

    private static void OooOO0(boolean z) {
        MqRunner.getInstance().OooO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(z).build().toByteString());
    }

    private boolean OooOO0O(String str, String str2) {
        if (this.OooooO0.get(str) == null) {
            OooO0O0(C2703R.string.ui_show_not_found_ui, str);
            return false;
        }
        this.OoooOoO[this.OooooO0.get(str).intValue()].OooO0oo(str2);
        return true;
    }

    private int OooOOO0() {
        int i = this.ooOO + 1;
        this.ooOO = i;
        return i;
    }

    private void OooOOOO(String str) {
        C4613ze[] c4613zeArr = this.OoooOoO;
        int i = this.OoooOoo;
        if (c4613zeArr[i] == null) {
            OooOO0(false);
            return;
        }
        View viewOooOOO0 = c4613zeArr[i].OooOOO0(str);
        if (viewOooOOO0 == null) {
            OooOO0(false);
            return;
        }
        boolean zIsEnabled = viewOooOOO0.isEnabled();
        if (this.OooooOO[this.OoooOoo].get(str) == EnumC2696m.EDIT_TEXT) {
            zIsEnabled = ((EditText) viewOooOOO0).isFocusable();
        }
        MqRunner.getInstance().OooO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(str).setType(UiMessage.ControlVar.Data_Type.BOOL).setBoolValue(zIsEnabled).build()).build().toByteString());
    }

    private void OooOOOo(String str, int i) {
        boolean z = true;
        if (this.Oooooo.get(str) == null) {
            z = false;
            OooO0O0(C2703R.string.ui_show_not_found_float, str);
        } else {
            this.OooooOo[this.Oooooo.get(str).intValue()].OooO0Oo(i);
            this.OooooOo[this.Oooooo.get(str).intValue()].OooOOoo();
        }
        OooOO0(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean OooOOo(UiMessage.CommandToUi commandToUi) {
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
        switch (OooO0o.OooO00o[commandToUi.getCommand().ordinal()]) {
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
                    radioButton.setPadding(0, OooOOoo(), 0, OooOOoo());
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

    private void OooOOo0(String str, String str2) {
        if (!str2.matches(o00O0O)) {
            OooO0O0(C2703R.string.ui_show_invalid_color_value, new Object[0]);
            OooOO0(false);
            return;
        }
        if (!str2.startsWith("#")) {
            str2 = "#".concat(String.valueOf(str2));
        }
        int iOooO00o = C3948hf.OooO00o(Color.parseColor(str2));
        if (this.Oooooo.get(str) != null) {
            this.OooooOo[this.Oooooo.get(str).intValue()].OooOO0O(iOooO00o);
            this.OooooOo[this.Oooooo.get(str).intValue()].OooOOoo();
        } else {
            String str3 = this.Ooooooo.get(str);
            if (str3 == null) {
                OooOO0(false);
                return;
            }
            View viewOooO00o = this.OooooOo[this.Oooooo.get(str3).intValue()].OooO00o(str);
            if (viewOooO00o == null) {
                OooOO0(false);
                return;
            } else if (this.OoooooO.get(str) == EnumC2696m.BUTTON) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadii(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f});
                gradientDrawable.setColor(iOooO00o);
                viewOooO00o.setBackground(gradientDrawable);
            } else if (this.OoooooO.get(str) != EnumC2696m.SPINNER) {
                viewOooO00o.setBackgroundColor(iOooO00o);
            }
        }
        OooOO0(true);
    }

    private int OooOOoo() {
        return (int) ((this.Ooooo00.getResources().getDisplayMetrics().densityDpi / 160.0f) * 5.0f);
    }

    private void OooOo(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooOO0(false);
            return;
        }
        String controlId = commandToUi.getControlId();
        commandToUi.getText();
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
        if (viewOooOOO0 == null) {
            OooOO0(false);
        } else if (this.OooooOO[this.OoooOoo].get(controlId) != EnumC2696m.EDIT_TEXT) {
            OooOO0(false);
        } else {
            ((EditText) viewOooOOO0).setInputType(commandToUi.getEditInputType());
            OooOO0(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void OooOo0(java.lang.String r5) {
        /*
            r4 = this;
            z2.ze[] r0 = r4.OoooOoO
            int r1 = r4.OoooOoo
            r2 = r0[r1]
            r3 = 0
            if (r2 != 0) goto Ld
            OooOO0(r3)
            return
        Ld:
            r0 = r0[r1]
            android.view.View r0 = r0.OooOOO0(r5)
            if (r0 != 0) goto L19
            OooOO0(r3)
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
            com.cyjh.mq.sdk.MqRunner r0 = com.cyjh.p202mq.sdk.MqRunner.getInstance()
            com.google.protobuf.ByteString r5 = r5.toByteString()
            r0.OooO(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.ViewOnClickListenerC4539xe.OooOo0(java.lang.String):void");
    }

    private void OooOo00(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooOO0(false);
            return;
        }
        new StringBuilder("SET FONT type: ").append(commandToUi.getFontType());
        String controlId = commandToUi.getControlId();
        Typeface typefaceCreate = Typeface.create(commandToUi.getFontType(), 0);
        if (typefaceCreate == null) {
            OooOO0(false);
            return;
        }
        int fontSize = commandToUi.getFontSize() < 0 ? 14 : commandToUi.getFontSize();
        if (this.OooooO0.get(controlId) != null && this.OoooOoO[this.OooooO0.get(controlId).intValue()] != null) {
            this.OoooOoO[this.OooooO0.get(controlId).intValue()].OooO0o0(typefaceCreate, fontSize);
            OooOO0(true);
            return;
        }
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
        if (viewOooOOO0 == null) {
            OooOO0(false);
            return;
        }
        if (this.OooooOO[this.OoooOoo].get(controlId) == null) {
            OooOO0(false);
            return;
        }
        int i = OooO0o.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(controlId)).ordinal()];
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
                OooOO0(false);
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
        OooOO0(true);
    }

    private boolean OooOo0O(String str, String str2) {
        View viewOooO00o;
        if (this.Oooooo.get(str) == null) {
            String str3 = this.Ooooooo.get(str);
            if (str3 == null || (viewOooO00o = this.OooooOo[this.Oooooo.get(str3).intValue()].OooO00o(str)) == null) {
                return false;
            }
            if (this.OoooooO.get(str) == EnumC2696m.IMAGE_VIEW) {
                ((ImageView) viewOooO00o).setImageURI(Uri.fromFile(new File(str2)));
            }
            return true;
        }
        C2695j c2695j = this.OooooOo[this.Oooooo.get(str).intValue()];
        c2695j.Ooooooo = str2;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str2);
        if (Build.VERSION.SDK_INT >= 16) {
            c2695j.OooooO0.setBackground(new BitmapDrawable(bitmapDecodeFile));
        }
        c2695j.OooooO0.getBackground().setAlpha((c2695j.OoooooO * 255) / 100);
        this.OooooOo[this.Oooooo.get(str).intValue()].OooOOoo();
        return true;
    }

    private void OooOo0o() {
        this.Oooooo.clear();
        this.OoooooO.clear();
        this.Ooooooo.clear();
        OooO00o();
        this.OoooOoo = 0;
        this.ooOO = 1;
        for (int i = 0; i < 32; i++) {
            this.OoooOoO[i] = null;
            HashMap[] mapArr = this.OooooOO;
            if (mapArr[i] != null) {
                mapArr[i].clear();
            }
        }
        this.OooooOo = new C2695j[32];
        this.Oooooo0 = 0;
    }

    private void OooOoO(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooOO0(false);
            return;
        }
        String controlId = commandToUi.getControlId();
        String text = commandToUi.getText();
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
        if (viewOooOOO0 == null) {
            OooOO0(false);
            return;
        }
        if (this.OooooOO[this.OoooOoo].get(controlId) == null) {
            OooOO0(false);
            return;
        }
        switch (OooO0o.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(controlId)).ordinal()]) {
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
                    OooOO0(false);
                    return;
                }
                radioButton.setText(text);
                break;
            case 6:
                Spinner spinner = (Spinner) viewOooOOO0;
                if (commandToUi.getItemIndex() >= spinner.getCount()) {
                    OooOO0(false);
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
                OooOO0(false);
                return;
        }
        OooOO0(true);
    }

    private void OooOoO0(String str) {
        C4613ze[] c4613zeArr = this.OoooOoO;
        int i = this.OoooOoo;
        if (c4613zeArr[i] == null) {
            OooOO0(false);
            return;
        }
        View viewOooOOO0 = c4613zeArr[i].OooOOO0(str);
        if (viewOooOOO0 == null) {
            OooOO0(false);
            return;
        }
        MqRunner.getInstance().OooO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(str).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue("#" + Integer.toHexString(C3948hf.OooO00o(viewOooOOO0.getSolidColor()) & ViewCompat.MEASURED_SIZE_MASK)).build()).build().toByteString());
    }

    private void OooOoOO(String str) throws Throwable {
        if (this.OoooOoO[this.OoooOoo] == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.OooooOO[this.OoooOoo].entrySet()) {
            String str2 = (String) entry.getKey();
            int i = OooO0o.OooO0O0[((EnumC2696m) entry.getValue()).ordinal()];
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

    private void OooOoo(String str) throws JSONException, IOException {
        if (this.OooooOO[this.OoooOoo] == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(FileUtils.readFileToString(new File(str)));
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (this.OooooOO[this.OoooOoo].get(next) != null) {
                int i = OooO0o.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(next)).ordinal()];
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

    private void OooOoo0(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooOO0(false);
            return;
        }
        String controlId = commandToUi.getControlId();
        String color = commandToUi.getColor();
        if (!color.matches(o00O0O)) {
            OooO0O0(C2703R.string.ui_show_invalid_color_value, new Object[0]);
            OooOO0(false);
            return;
        }
        if (!color.startsWith("#")) {
            color = "#".concat(String.valueOf(color));
        }
        int iOooO00o = C3948hf.OooO00o(Color.parseColor(color));
        if (this.OooooO0.get(controlId) != null) {
            this.OoooOoO[this.OooooO0.get(controlId).intValue()].OooO0OO(iOooO00o);
            OooOO0(true);
            return;
        }
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
        if (viewOooOOO0 == null) {
            OooOO0(false);
            return;
        }
        switch (OooO0o.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(controlId)).ordinal()]) {
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
                    OooOO0(false);
                    return;
                }
                radioButton.setTextColor(iOooO00o);
                break;
            case 6:
                if (commandToUi.getItemIndex() >= ((Spinner) viewOooOOO0).getCount()) {
                    OooOO0(false);
                    return;
                }
                break;
            default:
                OooOO0(false);
                return;
        }
        OooOO0(true);
    }

    private void OooOooO(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooOO0(false);
            return;
        }
        String controlId = commandToUi.getControlId();
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
        if (viewOooOOO0 == null) {
            OooOO0(false);
            return;
        }
        String color = commandToUi.getColor();
        if (!color.matches(o00O0O)) {
            OooO0O0(C2703R.string.ui_show_invalid_color_value, new Object[0]);
            OooOO0(false);
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
            OooOO0(true);
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iOooO00o);
            gradientDrawable.setCornerRadius(OooOOoo());
            viewOooOOO0.setBackground(gradientDrawable);
            OooOO0(true);
        }
    }

    private void OooOooo(String str) {
        if (this.OooooO0.get(str) == null) {
            OooO0O0(C2703R.string.ui_show_not_found_ui, str);
            OooOO0(false);
        } else {
            if (this.OoooOoO[this.OooooO0.get(str).intValue()].OooOOo0) {
                OooOO0(false);
                return;
            }
            this.OoooOoO[this.OooooO0.get(str).intValue()].OooOOoo();
            OooOO0(true);
            MqRunner.getInstance().OooO0Oo(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setIsSuccess(true).setEvent(UiMessage.ControlEvent.newBuilder().setControlId(str).setType(UiMessage.ControlEvent.Event_Type.ON_SHOW).build()).build().toByteString());
        }
    }

    private void Oooo(UiMessage.CommandToUi commandToUi) {
        String controlId = commandToUi.getControlId();
        String strParam = commandToUi.getStrParam();
        if (!strParam.matches(o00O0O)) {
            OooO0O0(C2703R.string.ui_show_invalid_color_value, new Object[0]);
            OooOO0(false);
            return;
        }
        if (!strParam.startsWith("#")) {
            strParam = "#".concat(String.valueOf(strParam));
        }
        int iOooO00o = C3948hf.OooO00o(Color.parseColor(strParam));
        String str = this.Ooooooo.get(controlId);
        if (str == null) {
            OooOO0(false);
            return;
        }
        View viewOooO00o = this.OooooOo[this.Oooooo.get(str).intValue()].OooO00o(controlId);
        if (viewOooO00o == null) {
            OooOO0(false);
            return;
        }
        if (this.OoooooO.get(controlId) == EnumC2696m.BUTTON) {
            ((Button) viewOooO00o).setTextColor(iOooO00o);
        }
        if (this.OoooooO.get(controlId) == EnumC2696m.TEXT_VIEW) {
            ((TextView) viewOooO00o).setTextColor(iOooO00o);
        }
        this.OooooOo[this.Oooooo.get(str).intValue()].OooOOoo();
        OooOO0(true);
    }

    private void Oooo0(String str) {
        Oooo0OO(str);
        MqRunner.getInstance().OooO0Oo(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setIsSuccess(true).setEvent(UiMessage.ControlEvent.newBuilder().setControlId(str).setType(UiMessage.ControlEvent.Event_Type.ON_CLOSE_CONTINUE).build()).build().toByteString());
    }

    private void Oooo000(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooOO0(false);
            return;
        }
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(commandToUi.getControlId());
        if (viewOooOOO0 == null) {
            OooOO0(false);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewOooOOO0.getLayoutParams();
        layoutParams.gravity = commandToUi.getAlignType();
        viewOooOOO0.setLayoutParams(layoutParams);
        new StringBuilder("set gravity ok; ").append(layoutParams);
        OooOO0(true);
    }

    private void Oooo00O(String str) {
        if (this.OooooO0.get(str) != null) {
            MqRunner.getInstance().OooO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(str).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(this.OoooOoO[this.OooooO0.get(str).intValue()].OooO0O0()).build()).build().toByteString());
        } else {
            OooO0O0(C2703R.string.ui_show_not_found_ui, str);
            OooOO0(false);
        }
    }

    private void Oooo00o(UiMessage.CommandToUi commandToUi) {
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooOO0(false);
            return;
        }
        View viewOooOOO0 = this.OoooOoO[this.OoooOoo].OooOOO0(commandToUi.getControlId());
        if (viewOooOOO0 == null) {
            OooOO0(false);
            return;
        }
        UiMessage.Padding_Var padding = commandToUi.getPadding();
        new StringBuilder("padding: ").append(padding.getLeft());
        new StringBuilder("padding: ").append(padding.getTop());
        new StringBuilder("padding: ").append(padding.getRight());
        new StringBuilder("padding: ").append(padding.getBottom());
        viewOooOOO0.setPadding(padding.getLeft(), padding.getTop(), padding.getRight(), padding.getBottom());
        OooOO0(true);
    }

    private void Oooo0O0(UiMessage.CommandToUi commandToUi) {
        TextPaint paint;
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooOO0(false);
            return;
        }
        String controlId = commandToUi.getControlId();
        if (this.OooooOO[this.OoooOoo].get(controlId) == null) {
            OooOO0(false);
            return;
        }
        int i = OooO0o.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(controlId)).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            paint = ((TextView) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).getPaint();
        } else if (i == 4) {
            paint = ((CheckBox) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).getPaint();
        } else {
            if (i != 5) {
                OooOO0(false);
                return;
            }
            RadioButton radioButton = (RadioButton) ((RadioGroup) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).findViewById(commandToUi.getItemIndex());
            if (radioButton == null) {
                OooOO0(false);
                return;
            }
            paint = radioButton.getPaint();
        }
        int color = paint.getColor();
        MqRunner.getInstance().OooO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(controlId).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(String.format("%02X%02X%02X", Integer.valueOf(Color.blue(color)), Integer.valueOf(Color.green(color)), Integer.valueOf(Color.red(color)))).build()).build().toByteString());
    }

    private boolean Oooo0OO(String str) {
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

    private void Oooo0o(String str) {
        UiMessage.ControlVar.Builder type;
        int checkedRadioButtonId;
        MqRunner mqRunner;
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
            mqRunner = MqRunner.getInstance();
            isSuccess = isSuccess.setIsSuccess(false);
        } else {
            switch (OooO0o.OooO0O0[enumC2696m.ordinal()]) {
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
            mqRunner = MqRunner.getInstance();
        }
        mqRunner.OooO(isSuccess.build().toByteString());
    }

    private void Oooo0o0(UiMessage.CommandToUi commandToUi) {
        CharSequence text;
        String string;
        if (this.OoooOoO[this.OoooOoo] == null) {
            OooOO0(false);
        }
        String controlId = commandToUi.getControlId();
        if (this.OooooOO[this.OoooOoo].get(controlId) == null) {
            OooOO0(false);
            return;
        }
        switch (OooO0o.OooO0O0[((EnumC2696m) this.OooooOO[this.OoooOoo].get(controlId)).ordinal()]) {
            case 1:
            case 2:
            case 3:
                text = ((TextView) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).getText();
                string = text.toString();
                MqRunner.getInstance().OooO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(controlId).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(string).build()).build().toByteString());
                break;
            case 4:
                text = ((CheckBox) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).getText();
                string = text.toString();
                MqRunner.getInstance().OooO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(controlId).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(string).build()).build().toByteString());
                break;
            case 5:
                RadioButton radioButton = (RadioButton) ((RadioGroup) this.OoooOoO[this.OoooOoo].OooOOO0(controlId)).findViewById(commandToUi.getItemIndex());
                if (radioButton != null) {
                    text = radioButton.getText();
                    string = text.toString();
                    MqRunner.getInstance().OooO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(controlId).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(string).build()).build().toByteString());
                } else {
                    OooOO0(false);
                }
                break;
            case 6:
                Spinner spinner = (Spinner) this.OoooOoO[this.OoooOoo].OooOOO0(controlId);
                if (commandToUi.getItemIndex() < spinner.getCount()) {
                    new StringBuilder("Spinner Get pos: ").append(spinner.getItemAtPosition(commandToUi.getItemIndex()));
                    string = (String) spinner.getItemAtPosition(commandToUi.getItemIndex());
                    MqRunner.getInstance().OooO(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.RSP_MSG).setIsSuccess(true).addVarTable(UiMessage.ControlVar.newBuilder().setControlId(controlId).setType(UiMessage.ControlVar.Data_Type.STRING).setStringValue(string).build()).build().toByteString());
                } else {
                    OooOO0(false);
                }
                break;
            default:
                OooOO0(false);
                break;
        }
    }

    private void Oooo0oO(UiMessage.CommandToUi commandToUi) {
        String controlId = commandToUi.getControlId();
        String color = commandToUi.getColor();
        if (this.OooooO0.get(controlId) == null) {
            OooO0O0(C2703R.string.ui_show_not_found_ui, controlId);
            OooOO0(false);
        } else {
            if (!color.matches(o00O0O)) {
                OooO0O0(C2703R.string.ui_show_invalid_color_value, new Object[0]);
                OooOO0(false);
                return;
            }
            if (!color.startsWith("#")) {
                color = "#".concat(String.valueOf(color));
            }
            this.OoooOoO[this.OooooO0.get(controlId).intValue()].OooOOOO(C3948hf.OooO00o(Color.parseColor(color)));
            OooOO0(true);
        }
    }

    private void Oooo0oo(String str) {
        if (this.Oooooo.get(str) == null) {
            OooO0O0(C2703R.string.ui_show_not_found_float, str);
            OooOO0(false);
        } else {
            if (this.OooooOo[this.Oooooo.get(str).intValue()].OooooOO) {
                OooOO0(false);
                return;
            }
            this.OooooOo[this.Oooooo.get(str).intValue()].OooO0OO();
            OooOO0(true);
            OooO0oo(str, UiMessage.ControlEvent.Event_Type.ON_SHOW);
        }
    }

    private void OoooO(String str) {
        if (this.Oooooo.get(str) == null) {
            OooO0O0(C2703R.string.ui_show_not_found_float, str);
            OooOO0(false);
            return;
        }
        this.OooooOo[this.Oooooo.get(str).intValue()].OooOOo0();
        this.Oooooo0--;
        this.Oooooo.remove(str);
        OooO0oo(str, UiMessage.ControlEvent.Event_Type.ON_CLOSE);
        OooOO0(true);
    }

    private void OoooO0(String str) {
        if (this.Oooooo.get(str) == null) {
            OooO0O0(C2703R.string.ui_show_not_found_float, str);
            OooOO0(false);
        } else if (!this.OooooOo[this.Oooooo.get(str).intValue()].OooooOO) {
            OooOO0(false);
        } else {
            this.OooooOo[this.Oooooo.get(str).intValue()].OooOO0();
            OooOO0(true);
        }
    }

    private void OoooO00(String str) {
        if (this.Oooooo.get(str) == null) {
            OooO0O0(C2703R.string.ui_show_not_found_float, str);
            OooOO0(false);
        } else {
            if (!this.OooooOo[this.Oooooo.get(str).intValue()].OooooOO) {
                OooOO0(true);
                return;
            }
            C2695j c2695j = this.OooooOo[this.Oooooo.get(str).intValue()];
            RelativeLayout relativeLayout = c2695j.OooooO0;
            if (relativeLayout != null && c2695j.OooooOO) {
                c2695j.Ooooo00.removeView(relativeLayout);
                c2695j.Ooooo00.addView(c2695j.OooooO0, c2695j.Ooooo0o);
            }
            OooOO0(true);
        }
    }

    private boolean OoooO0O(UiMessage.CommandToUi commandToUi) {
        String controlId = commandToUi.getControlId();
        String str = this.Ooooooo.get(controlId);
        new StringBuilder("doReSetView value: ").append(commandToUi.getCommand().toString());
        if (str == null) {
            OooOO0(false);
            return false;
        }
        new StringBuilder("doReSetView value: ").append(commandToUi.getCommand().toString());
        View viewOooO00o = this.OooooOo[this.Oooooo.get(str).intValue()].OooO00o(controlId);
        if (viewOooO00o == null) {
            OooOO0(false);
            return false;
        }
        new StringBuilder("doReSetView value: ").append(commandToUi.getCommand().toString());
        switch (OooO0o.OooO00o[commandToUi.getCommand().ordinal()]) {
            case 64:
                if (this.OoooooO.get(controlId) == EnumC2696m.BUTTON) {
                    Button button = (Button) viewOooO00o;
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewOooO00o.getLayoutParams();
                    layoutParams.width = commandToUi.getWidth();
                    layoutParams.height = commandToUi.getHeight();
                    button.setLayoutParams(layoutParams);
                    button.setText(commandToUi.getText());
                    button.setX(commandToUi.getLeft());
                    button.setY(commandToUi.getTop());
                }
                break;
            case 65:
                if (this.OoooooO.get(controlId) == EnumC2696m.TEXT_VIEW) {
                    TextView textView = (TextView) viewOooO00o;
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewOooO00o.getLayoutParams();
                    layoutParams2.width = commandToUi.getWidth();
                    layoutParams2.height = commandToUi.getHeight();
                    textView.setLayoutParams(layoutParams2);
                    textView.setText(commandToUi.getText());
                    textView.setX(commandToUi.getLeft());
                    textView.setY(commandToUi.getTop());
                }
                break;
            case 66:
                if (this.OoooooO.get(controlId) == EnumC2696m.IMAGE_VIEW) {
                    ImageView imageView = (ImageView) viewOooO00o;
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                    layoutParams3.width = commandToUi.getWidth();
                    layoutParams3.height = commandToUi.getHeight();
                    imageView.setLayoutParams(layoutParams3);
                    imageView.setX(commandToUi.getLeft());
                    imageView.setY(commandToUi.getTop());
                    imageView.setImageURI(Uri.fromFile(new File(commandToUi.getText())));
                }
                break;
        }
        this.OooooOo[this.Oooooo.get(str).intValue()].OooOOoo();
        OooOO0(true);
        return true;
    }

    private boolean OoooOO0(UiMessage.CommandToUi commandToUi) {
        C2695j c2695j;
        View viewOooO00o;
        String controlId = commandToUi.getControlId();
        String str = this.Ooooooo.get(controlId);
        boolean z = false;
        if (str == null) {
            return false;
        }
        try {
            c2695j = this.OooooOo[this.Oooooo.get(str).intValue()];
        } catch (Exception unused) {
        }
        if (c2695j == null || (viewOooO00o = c2695j.OooO00o(controlId)) == null) {
            return false;
        }
        int i = OooO0o.OooO0O0[this.OoooooO.get(controlId).ordinal()];
        z = true;
        if (i == 1 || i == 3) {
            new StringBuilder("setFloatTextSize value: ").append(commandToUi.getFontSize());
            ((TextView) viewOooO00o).setTextSize(2, commandToUi.getFontSize());
        }
        c2695j.OooOOoo();
        return z;
    }

    private boolean OoooOOO(UiMessage.CommandToUi commandToUi) {
        View viewOooO00o;
        String controlId = commandToUi.getControlId();
        String str = this.Ooooooo.get(controlId);
        if (str == null) {
            return false;
        }
        try {
            C2695j c2695j = this.OooooOo[this.Oooooo.get(str).intValue()];
            if (c2695j == null || (viewOooO00o = c2695j.OooO00o(controlId)) == null) {
                return false;
            }
            int i = OooO0o.OooO00o[commandToUi.getCommand().ordinal()];
            if (i == 68) {
                new StringBuilder("doFloatSetStatus ").append(commandToUi.getEnabledStatus());
                viewOooO00o.setEnabled(commandToUi.getEnabledStatus());
            } else if (i == 69) {
                new StringBuilder("doFloatSetStatus ").append(commandToUi.getVisibleStatus());
                if (commandToUi.getVisibleStatus() != 0) {
                    viewOooO00o.setVisibility(0);
                } else {
                    viewOooO00o.setVisibility(8);
                }
            }
            c2695j.OooOOoo();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean OoooOOo(com.cyjh.mobileanjian.ipc.share.proto.UiMessage.CommandToUi r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getControlId()
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r5.Ooooooo
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            if (r1 != 0) goto L10
            return r2
        L10:
            com.cyjh.mobileanjian.ipc.ui.j[] r3 = r5.OooooOo     // Catch: java.lang.Exception -> L84
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r5.Oooooo     // Catch: java.lang.Exception -> L84
            java.lang.Object r1 = r4.get(r1)     // Catch: java.lang.Exception -> L84
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L84
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L84
            r1 = r3[r1]     // Catch: java.lang.Exception -> L84
            if (r1 != 0) goto L23
            return r2
        L23:
            android.view.View r1 = r1.OooO00o(r0)
            if (r1 != 0) goto L2a
            return r2
        L2a:
            int[] r3 = p285z2.ViewOnClickListenerC4539xe.OooO0o.OooO00o
            com.cyjh.mobileanjian.ipc.share.proto.UiMessage$CommandToUi$Command_Type r6 = r6.getCommand()
            int r6 = r6.ordinal()
            r6 = r3[r6]
            java.lang.String r3 = "true"
            r4 = 1
            switch(r6) {
                case 70: goto L73;
                case 71: goto L44;
                case 72: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L7a
        L3d:
            int r6 = r1.getVisibility()
            if (r6 != 0) goto L7a
            goto L7c
        L44:
            java.util.HashMap<java.lang.String, com.cyjh.mobileanjian.ipc.ui.m> r6 = r5.OoooooO
            java.lang.Object r6 = r6.get(r0)
            com.cyjh.mobileanjian.ipc.ui.m r0 = com.cyjh.mobileanjian.ipc.p201ui.EnumC2696m.IMAGE_VIEW
            if (r6 == r0) goto L7a
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r6 = r1.getCurrentTextColor()
            int r6 = p285z2.C3948hf.OooO00o(r6)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r1
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r0[r2] = r6
            java.lang.String r6 = "%6s"
            java.lang.String r6 = java.lang.String.format(r6, r0)
            java.lang.String r0 = " "
            java.lang.String r1 = "0"
            java.lang.String r3 = r6.replace(r0, r1)
            goto L7c
        L73:
            boolean r6 = r1.isEnabled()
            if (r6 == 0) goto L7a
            goto L7c
        L7a:
            java.lang.String r3 = "false"
        L7c:
            com.cyjh.mq.sdk.MqRunner r6 = com.cyjh.p202mq.sdk.MqRunner.getInstance()
            r6.mo13090a(r3)
            return r4
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.ViewOnClickListenerC4539xe.OoooOOo(com.cyjh.mobileanjian.ipc.share.proto.UiMessage$CommandToUi):boolean");
    }

    private boolean OoooOo0(UiMessage.CommandToUi commandToUi) {
        View viewOooO00o;
        String controlId = commandToUi.getControlId();
        if (this.Oooooo.get(controlId) != null) {
            this.OooooOo[this.Oooooo.get(controlId).intValue()].setFloatLeft(commandToUi.getIntParam());
            return true;
        }
        String str = this.Ooooooo.get(controlId);
        if (str == null || (viewOooO00o = this.OooooOo[this.Oooooo.get(str).intValue()].OooO00o(controlId)) == null) {
            return false;
        }
        if (this.OoooooO.get(controlId) != EnumC2696m.BUTTON && this.OoooooO.get(controlId) != EnumC2696m.TEXT_VIEW && this.OoooooO.get(controlId) != EnumC2696m.IMAGE_VIEW) {
            return true;
        }
        new StringBuilder("view.setX ").append(commandToUi.getIntParam());
        viewOooO00o.setX(commandToUi.getIntParam());
        return true;
    }

    private boolean OoooOoO(UiMessage.CommandToUi commandToUi) {
        View viewOooO00o;
        String controlId = commandToUi.getControlId();
        if (this.Oooooo.get(controlId) != null) {
            this.OooooOo[this.Oooooo.get(controlId).intValue()].setFloatTop(commandToUi.getIntParam());
            return true;
        }
        String str = this.Ooooooo.get(controlId);
        if (str == null || (viewOooO00o = this.OooooOo[this.Oooooo.get(str).intValue()].OooO00o(controlId)) == null) {
            return false;
        }
        if (this.OoooooO.get(controlId) != EnumC2696m.BUTTON && this.OoooooO.get(controlId) != EnumC2696m.TEXT_VIEW && this.OoooooO.get(controlId) != EnumC2696m.IMAGE_VIEW) {
            return true;
        }
        new StringBuilder("view.setY ").append(commandToUi.getIntParam());
        viewOooO00o.setY(commandToUi.getIntParam());
        return true;
    }

    private boolean OoooOoo(UiMessage.CommandToUi commandToUi) {
        View viewOooO00o;
        String controlId = commandToUi.getControlId();
        if (this.Oooooo.get(controlId) != null) {
            this.OooooOo[this.Oooooo.get(controlId).intValue()].setFloatWidth(commandToUi.getIntParam());
            return true;
        }
        String str = this.Ooooooo.get(controlId);
        if (str == null || (viewOooO00o = this.OooooOo[this.Oooooo.get(str).intValue()].OooO00o(controlId)) == null) {
            return false;
        }
        if (this.OoooooO.get(controlId) != EnumC2696m.BUTTON && this.OoooooO.get(controlId) != EnumC2696m.TEXT_VIEW && this.OoooooO.get(controlId) != EnumC2696m.IMAGE_VIEW) {
            return true;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewOooO00o.getLayoutParams();
        layoutParams.width = commandToUi.getIntParam();
        viewOooO00o.setLayoutParams(layoutParams);
        return true;
    }

    private boolean Ooooo00(UiMessage.CommandToUi commandToUi) {
        View viewOooO00o;
        String controlId = commandToUi.getControlId();
        if (this.Oooooo.get(controlId) != null) {
            this.OooooOo[this.Oooooo.get(controlId).intValue()].setFloatHeight(commandToUi.getIntParam());
            return true;
        }
        String str = this.Ooooooo.get(controlId);
        if (str == null || (viewOooO00o = this.OooooOo[this.Oooooo.get(str).intValue()].OooO00o(controlId)) == null) {
            return false;
        }
        if (this.OoooooO.get(controlId) != EnumC2696m.BUTTON && this.OoooooO.get(controlId) != EnumC2696m.TEXT_VIEW && this.OoooooO.get(controlId) != EnumC2696m.IMAGE_VIEW) {
            return true;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewOooO00o.getLayoutParams();
        layoutParams.height = commandToUi.getIntParam();
        viewOooO00o.setLayoutParams(layoutParams);
        return true;
    }

    private boolean Ooooo0o(UiMessage.CommandToUi commandToUi) {
        C2695j c2695j;
        View viewOooO00o;
        String controlId = commandToUi.getControlId();
        new StringBuilder("setFloatText : ").append(commandToUi.getStrParam());
        String str = this.Ooooooo.get(controlId);
        boolean z = false;
        if (str == null) {
            return false;
        }
        try {
            c2695j = this.OooooOo[this.Oooooo.get(str).intValue()];
        } catch (Exception unused) {
        }
        if (c2695j == null || (viewOooO00o = c2695j.OooO00o(controlId)) == null) {
            return false;
        }
        int i = OooO0o.OooO0O0[this.OoooooO.get(controlId).ordinal()];
        z = true;
        if (i == 1) {
            ((TextView) viewOooO00o).setText(commandToUi.getStrParam());
        } else if (i == 3) {
            ((Button) viewOooO00o).setText(commandToUi.getStrParam());
        }
        c2695j.OooOOoo();
        return z;
    }

    private void o000oOoO(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (this.Oooooo.get(str) != null) {
            WindowManager.LayoutParams params = this.OooooOo[this.Oooooo.get(str).intValue()].getParams();
            jSONObject.put("Left", params.x);
            jSONObject.put("Top", params.y);
            jSONObject.put("Width", params.width);
            jSONObject.put("Height", params.height);
        } else {
            String str2 = this.Ooooooo.get(str);
            EnumC2696m enumC2696m = this.OoooooO.get(str);
            if (enumC2696m == null) {
                OooO0O0(C2703R.string.ui_show_not_found_widget, str);
                MqRunner.getInstance().mo13090a(jSONObject.toString());
            }
            int i = OooO0o.OooO0O0[enumC2696m.ordinal()];
            if (i == 1) {
                TextView textView = (TextView) this.OooooOo[this.Oooooo.get(str2).intValue()].OooO00o(str);
                jSONObject.put("Left", textView.getLeft());
                jSONObject.put("Top", textView.getTop());
                jSONObject.put("Text", textView.getText());
                jSONObject.put("Width", textView.getWidth());
                jSONObject.put("Height", textView.getHeight());
            } else {
                if (i != 3) {
                    if (i == 7) {
                        ImageView imageView = (ImageView) this.OooooOo[this.Oooooo.get(str2).intValue()].OooO00o(str);
                        jSONObject.put("Left", imageView.getLeft());
                        jSONObject.put("Top", imageView.getTop());
                        jSONObject.put("Width", imageView.getWidth());
                        jSONObject.put("Height", imageView.getHeight());
                    }
                    new StringBuilder("FWGetValue json: ").append(jSONObject.toString());
                    MqRunner.getInstance().mo13090a(jSONObject.toString());
                }
                Button button = (Button) this.OooooOo[this.Oooooo.get(str2).intValue()].OooO00o(str);
                jSONObject.put("Left", button.getLeft());
                jSONObject.put("Top", button.getTop());
                jSONObject.put("Text", button.getText());
                jSONObject.put("Width", button.getWidth());
                jSONObject.put("Height", button.getHeight());
            }
        }
        new StringBuilder("FWGetValue json: ").append(jSONObject.toString());
        MqRunner.getInstance().mo13090a(jSONObject.toString());
    }

    public final void OooO00o() {
        for (int i = 31; i > 0; i--) {
            C4613ze c4613ze = this.OoooOoO[i];
            if (c4613ze != null && c4613ze.OooOOo0) {
                c4613ze.OooOo0();
            }
            C2695j c2695j = this.OooooOo[i];
            if (c2695j != null && c2695j.OooooOO) {
                c2695j.OooOOo0();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x08d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(com.cyjh.mobileanjian.ipc.share.proto.UiMessage.CommandToUi r14) {
        /*
            Method dump skipped, instruction units count: 4408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.ViewOnClickListenerC4539xe.OooO0OO(com.cyjh.mobileanjian.ipc.share.proto.UiMessage$CommandToUi):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MqRunner.getInstance().OooO0Oo(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setEvent(UiMessage.ControlEvent.newBuilder().setControlId((String) view.getTag()).setType(UiMessage.ControlEvent.Event_Type.ON_CLICK).build()).setIsSuccess(true).build().toByteString());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        MqRunner.getInstance().OooO0Oo(UiMessage.UiToCommand.newBuilder().setCommand(UiMessage.UiToCommand.Command_Type.EVENT).setEvent(UiMessage.ControlEvent.newBuilder().setControlId((String) adapterView.getTag()).setEventArgs(String.valueOf(i)).setType(UiMessage.ControlEvent.Event_Type.ON_CLICK).build()).setIsSuccess(true).build().toByteString());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
