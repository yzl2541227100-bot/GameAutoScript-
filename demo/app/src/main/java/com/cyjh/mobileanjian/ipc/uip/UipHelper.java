package com.cyjh.mobileanjian.ipc.uip;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.JsonReader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.cyjh.mobileanjian.ipc.p201ui.SlidingTabLayout;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.cyjh.mobileanjian.ipc.uip.C2699c.OooO00o;
import com.cyjh.mqsdk.C2703R;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.p284io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p285z2.C3726bf;
import p285z2.C3763cf;

/* JADX INFO: loaded from: classes2.dex */
public class UipHelper implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private static final String Oooooo = new File(Environment.getExternalStorageDirectory(), ".uip.config.json").getAbsolutePath();
    public static final int UIP_MESSAGE = 0;
    private Context OoooOoO;
    private SlidingTabLayout OoooOoo;
    private C2697a Ooooo00;
    private C2699c Ooooo0o;
    private List<ScrollView> OooooO0;
    private boolean OooooOO;
    private Handler OooooOo = new OooO0O0();
    private JSONObject Oooooo0;

    public class OooO00o implements View.OnTouchListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            view.requestFocusFromTouch();
            return false;
        }
    }

    public class OooO0O0 extends Handler {
        public OooO0O0() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            try {
                UiMessage.CommandToUip from = UiMessage.CommandToUip.parseFrom((ByteString) message.obj);
                UiMessage.CommandToUip.Command_Type command = from.getCommand();
                String controlId = from.getControlId();
                new StringBuilder("GET UIP Command -->").append(from);
                if (command == UiMessage.CommandToUip.Command_Type.GET_UIP_ATTRIBUTE) {
                    UipHelper.OooO0OO(UipHelper.this, controlId);
                } else if (command == UiMessage.CommandToUip.Command_Type.SET_UIP_ATTRIBUTE) {
                    UipHelper.OooO0Oo(UipHelper.this, controlId, from.getUipAttributeData());
                }
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public UipHelper(Context context) {
        this.OoooOoO = context;
    }

    private LinearLayout OooO(String str, IUipJsonParser iUipJsonParser) throws Throwable {
        View horizontalLinearLayout;
        C2699c c2699c;
        if (iUipJsonParser == null) {
            iUipJsonParser = new DefaultUipJsonParser(this.OoooOoO);
        }
        this.Ooooo0o = new C2699c(this.OoooOoO);
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext() && jsonReader.nextName().startsWith(this.OoooOoO.getString(C2703R.string.ui_activity))) {
                jsonReader.beginObject();
                for (int i = 0; i < 32 && jsonReader.hasNext(); i++) {
                    String strNextName = jsonReader.nextName();
                    C2699c c2699c2 = this.Ooooo0o;
                    RadioButton radioButton = new RadioButton(c2699c2.getContext());
                    radioButton.setId(C2699c.OoooooO[c2699c2.OooooOo]);
                    radioButton.setPadding(0, 0, 0, c2699c2.Ooooo0o);
                    radioButton.setButtonDrawable(new BitmapDrawable((Bitmap) null));
                    radioButton.setTextColor(c2699c2.getResources().getColorStateList(C2703R.color.selector_tab));
                    radioButton.setText(strNextName);
                    radioButton.setLines(1);
                    radioButton.setEllipsize(TextUtils.TruncateAt.END);
                    c2699c2.OoooOoO.addView(radioButton);
                    ScrollView scrollView = new ScrollView(c2699c2.getContext());
                    c2699c2.OooooOO = scrollView;
                    scrollView.setDescendantFocusability(131072);
                    c2699c2.OooooOO.setFocusable(true);
                    c2699c2.OooooOO.setFocusableInTouchMode(true);
                    c2699c2.OooooOO.setOnTouchListener(c2699c2.new OooO00o());
                    c2699c2.OooooOO.setTag(strNextName);
                    c2699c2.OooooOO.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    LinearLayout linearLayout = new LinearLayout(c2699c2.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    c2699c2.OooooO0 = linearLayout;
                    c2699c2.OooooOO.addView(linearLayout);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_linearlayout))) {
                            horizontalLinearLayout = iUipJsonParser.parseHorizontalLinearLayout(jsonReader);
                            c2699c = this.Ooooo0o;
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_textview))) {
                            horizontalLinearLayout = iUipJsonParser.parseTextView(jsonReader);
                            c2699c = this.Ooooo0o;
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_button))) {
                            horizontalLinearLayout = iUipJsonParser.parseButton(jsonReader);
                            c2699c = this.Ooooo0o;
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_edittext))) {
                            horizontalLinearLayout = iUipJsonParser.parseEditText(jsonReader);
                            c2699c = this.Ooooo0o;
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_checkbox))) {
                            horizontalLinearLayout = iUipJsonParser.parseCheckBox(jsonReader);
                            c2699c = this.Ooooo0o;
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_spinner))) {
                            horizontalLinearLayout = iUipJsonParser.parseSpinner(jsonReader);
                            c2699c = this.Ooooo0o;
                        } else {
                            jsonReader.skipValue();
                        }
                        c2699c.OooO0O0(horizontalLinearLayout);
                    }
                    jsonReader.endObject();
                    C2699c c2699c3 = this.Ooooo0o;
                    c2699c3.Ooooo00.add(c2699c3.OooooOO);
                    c2699c3.OooooOo++;
                }
                jsonReader.endObject();
            }
            jsonReader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        this.Ooooo0o.setSelectTab(0);
        bindEvent(this.Ooooo0o.getScrollViewList());
        saveToConfigFile(Oooooo);
        return this.Ooooo0o;
    }

    private LinearLayout OooO00o(String str, IUipJsonParser iUipJsonParser) throws Throwable {
        View horizontalLinearLayout;
        if (iUipJsonParser == null) {
            iUipJsonParser = new DefaultUipJsonParser(this.OoooOoO);
        }
        LinearLayout linearLayout = new LinearLayout(this.OoooOoO);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        ViewPager viewPager = new ViewPager(this.OoooOoO);
        TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 1.0f;
        viewPager.setLayoutParams(layoutParams2);
        linearLayout.addView(viewPager);
        this.Ooooo00 = new C2697a(this.OoooOoO);
        this.Ooooo00.setLayoutParams(new LinearLayout.LayoutParams(-2, this.Ooooo00.OooO00o(20.0f)));
        C2697a c2697a = this.Ooooo00;
        c2697a.setPadding(0, c2697a.OooO00o(10.0f), 0, 0);
        linearLayout.addView(this.Ooooo00);
        List<ScrollView> arrayList = new ArrayList<>(32);
        ArrayList arrayList2 = new ArrayList(32);
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext() && jsonReader.nextName().startsWith(this.OoooOoO.getString(C2703R.string.ui_activity))) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    LinearLayout linearLayout2 = new LinearLayout(this.OoooOoO);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setLayoutParams(layoutParams);
                    ScrollView scrollView = new ScrollView(this.OoooOoO);
                    scrollView.setTag(strNextName);
                    scrollView.setLayoutParams(layoutParams);
                    scrollView.addView(linearLayout2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_linearlayout))) {
                            horizontalLinearLayout = iUipJsonParser.parseHorizontalLinearLayout(jsonReader);
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_textview))) {
                            horizontalLinearLayout = iUipJsonParser.parseTextView(jsonReader);
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_button))) {
                            horizontalLinearLayout = iUipJsonParser.parseButton(jsonReader);
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_edittext))) {
                            horizontalLinearLayout = iUipJsonParser.parseEditText(jsonReader);
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_checkbox))) {
                            horizontalLinearLayout = iUipJsonParser.parseCheckBox(jsonReader);
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_spinner))) {
                            horizontalLinearLayout = iUipJsonParser.parseSpinner(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                        linearLayout2.addView(horizontalLinearLayout);
                    }
                    jsonReader.endObject();
                    if (arrayList.size() < 32) {
                        arrayList2.add(strNextName);
                        arrayList.add(scrollView);
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        viewPager.setAdapter(new C3763cf(arrayList, arrayList2));
        this.Ooooo00.setViewPager(viewPager);
        bindEvent(arrayList);
        saveToConfigFile(Oooooo);
        return linearLayout;
    }

    private void OooO0O0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C2698b) || (childAt instanceof LinearLayout)) {
                OooO0O0((ViewGroup) childAt);
            } else if (!TextUtils.isEmpty((CharSequence) childAt.getTag(C2703R.id.uip_function_key))) {
                if (childAt instanceof Spinner) {
                    ((Spinner) childAt).setOnItemSelectedListener(this);
                } else if (childAt instanceof CheckBox) {
                    ((CheckBox) childAt).setOnClickListener(this);
                } else if (childAt instanceof Button) {
                    ((Button) childAt).setOnClickListener(this);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x009a, code lost:
    
        r0.put(r5, r6.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void OooO0OO(com.cyjh.mobileanjian.ipc.uip.UipHelper r5, java.lang.String r6) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.mobileanjian.ipc.uip.UipHelper.OooO0OO(com.cyjh.mobileanjian.ipc.uip.UipHelper, java.lang.String):void");
    }

    public static /* synthetic */ void OooO0Oo(UipHelper uipHelper, String str, String str2) {
        JsonReader jsonReader = new JsonReader(new StringReader(str2));
        try {
            Iterator<ScrollView> it = uipHelper.OooooO0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View viewFindViewWithTag = it.next().findViewWithTag(str);
                if (viewFindViewWithTag instanceof Spinner) {
                    Spinner spinner = (Spinner) viewFindViewWithTag;
                    int iNextInt = -1;
                    ArrayList arrayList = null;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        if (strNextName.equalsIgnoreCase(uipHelper.OoooOoO.getString(C2703R.string.ui_spinner_defaultitem))) {
                            iNextInt = jsonReader.nextInt();
                        } else if (strNextName.equalsIgnoreCase(uipHelper.OoooOoO.getString(C2703R.string.ui_spinner_items))) {
                            arrayList = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (arrayList != null) {
                        C3726bf c3726bf = new C3726bf(uipHelper.OoooOoO, arrayList);
                        c3726bf.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                        spinner.setAdapter((SpinnerAdapter) c3726bf);
                    }
                    if (iNextInt >= 0 && iNextInt < spinner.getCount()) {
                        spinner.setSelection(iNextInt);
                    }
                } else if (viewFindViewWithTag instanceof CheckBox) {
                    CheckBox checkBox = (CheckBox) viewFindViewWithTag;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        if (strNextName2.equalsIgnoreCase(uipHelper.OoooOoO.getString(C2703R.string.ui_checkbox_hintcontent))) {
                            checkBox.setText(jsonReader.nextString());
                        } else if (strNextName2.equalsIgnoreCase(uipHelper.OoooOoO.getString(C2703R.string.ui_checkbox_checked))) {
                            checkBox.setChecked(jsonReader.nextBoolean());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                } else if (viewFindViewWithTag instanceof Button) {
                    Button button = (Button) viewFindViewWithTag;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equalsIgnoreCase(uipHelper.OoooOoO.getString(C2703R.string.ui_textview_textcontent))) {
                            button.setText(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                } else if (viewFindViewWithTag instanceof EditText) {
                    EditText editText = (EditText) viewFindViewWithTag;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (strNextName3.equalsIgnoreCase(uipHelper.OoooOoO.getString(C2703R.string.ui_edittext_defaultcontent))) {
                            editText.setText(jsonReader.nextString());
                        } else if (strNextName3.equalsIgnoreCase("密码")) {
                            boolean zNextBoolean = false;
                            try {
                                zNextBoolean = jsonReader.nextBoolean();
                            } catch (Exception unused) {
                            }
                            editText.setTransformationMethod(zNextBoolean ? PasswordTransformationMethod.getInstance() : HideReturnsTransformationMethod.getInstance());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                } else if (viewFindViewWithTag instanceof TextView) {
                    TextView textView = (TextView) viewFindViewWithTag;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equalsIgnoreCase(uipHelper.OoooOoO.getString(C2703R.string.ui_textview_textcontent))) {
                            textView.setText(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
            }
            jsonReader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        UipEventStub.UiRequestReturn(UiMessage.UipToCommand.newBuilder().setCommand(UiMessage.UipToCommand.Command_Type.RSP_MSG).setIsSuccess(true).build().toByteString());
    }

    private void OooO0o(String str, String str2) {
        JsonReader jsonReader = new JsonReader(new StringReader(str2));
        try {
            Iterator<ScrollView> it = this.OooooO0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View viewFindViewWithTag = it.next().findViewWithTag(str);
                if (viewFindViewWithTag instanceof Spinner) {
                    Spinner spinner = (Spinner) viewFindViewWithTag;
                    int iNextInt = -1;
                    ArrayList arrayList = null;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        if (strNextName.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_spinner_defaultitem))) {
                            iNextInt = jsonReader.nextInt();
                        } else if (strNextName.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_spinner_items))) {
                            arrayList = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (arrayList != null) {
                        C3726bf c3726bf = new C3726bf(this.OoooOoO, arrayList);
                        c3726bf.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                        spinner.setAdapter((SpinnerAdapter) c3726bf);
                    }
                    if (iNextInt >= 0 && iNextInt < spinner.getCount()) {
                        spinner.setSelection(iNextInt);
                    }
                } else if (viewFindViewWithTag instanceof CheckBox) {
                    CheckBox checkBox = (CheckBox) viewFindViewWithTag;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_checkbox_hintcontent))) {
                            checkBox.setText(jsonReader.nextString());
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_checkbox_checked))) {
                            checkBox.setChecked(jsonReader.nextBoolean());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                } else if (viewFindViewWithTag instanceof Button) {
                    Button button = (Button) viewFindViewWithTag;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_textview_textcontent))) {
                            button.setText(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                } else if (viewFindViewWithTag instanceof EditText) {
                    EditText editText = (EditText) viewFindViewWithTag;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (strNextName3.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_edittext_defaultcontent))) {
                            editText.setText(jsonReader.nextString());
                        } else if (strNextName3.equalsIgnoreCase("密码")) {
                            boolean zNextBoolean = false;
                            try {
                                zNextBoolean = jsonReader.nextBoolean();
                            } catch (Exception unused) {
                            }
                            editText.setTransformationMethod(zNextBoolean ? PasswordTransformationMethod.getInstance() : HideReturnsTransformationMethod.getInstance());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                } else if (viewFindViewWithTag instanceof TextView) {
                    TextView textView = (TextView) viewFindViewWithTag;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_textview_textcontent))) {
                            textView.setText(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
            }
            jsonReader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        UipEventStub.UiRequestReturn(UiMessage.UipToCommand.newBuilder().setCommand(UiMessage.UipToCommand.Command_Type.RSP_MSG).setIsSuccess(true).build().toByteString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0096, code lost:
    
        r1 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009a, code lost:
    
        r0.put(r6, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void OooO0o0(java.lang.String r6) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.mobileanjian.ipc.uip.UipHelper.OooO0o0(java.lang.String):void");
    }

    private LinearLayout OooO0oO(String str, IUipJsonParser iUipJsonParser) throws Throwable {
        View horizontalLinearLayout;
        if (iUipJsonParser == null) {
            iUipJsonParser = new DefaultUipJsonParser(this.OoooOoO);
        }
        LinearLayout linearLayout = new LinearLayout(this.OoooOoO);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        SlidingTabLayout slidingTabLayout = new SlidingTabLayout(this.OoooOoO);
        this.OoooOoo = slidingTabLayout;
        slidingTabLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.OoooOoo.setSelectedIndicatorColors(this.OoooOoO.getResources().getColor(C2703R.color.ui_show_blue));
        this.OoooOoo.setDistributeEvenly(true);
        linearLayout.addView(this.OoooOoo);
        ViewPager viewPager = new ViewPager(this.OoooOoO);
        TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 1.0f;
        viewPager.setLayoutParams(layoutParams2);
        linearLayout.addView(viewPager);
        List<ScrollView> arrayList = new ArrayList<>(32);
        ArrayList arrayList2 = new ArrayList(32);
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext() && jsonReader.nextName().startsWith(this.OoooOoO.getString(C2703R.string.ui_activity))) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    LinearLayout linearLayout2 = new LinearLayout(this.OoooOoO);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setLayoutParams(layoutParams);
                    ScrollView scrollView = new ScrollView(this.OoooOoO);
                    scrollView.setTag(strNextName);
                    scrollView.setLayoutParams(layoutParams);
                    scrollView.addView(linearLayout2);
                    scrollView.setDescendantFocusability(131072);
                    scrollView.setFocusable(true);
                    scrollView.setFocusableInTouchMode(true);
                    scrollView.setOnTouchListener(new OooO00o());
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_linearlayout))) {
                            horizontalLinearLayout = iUipJsonParser.parseHorizontalLinearLayout(jsonReader);
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_textview))) {
                            horizontalLinearLayout = iUipJsonParser.parseTextView(jsonReader);
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_button))) {
                            horizontalLinearLayout = iUipJsonParser.parseButton(jsonReader);
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_edittext))) {
                            horizontalLinearLayout = iUipJsonParser.parseEditText(jsonReader);
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_checkbox))) {
                            horizontalLinearLayout = iUipJsonParser.parseCheckBox(jsonReader);
                        } else if (strNextName2.equalsIgnoreCase(this.OoooOoO.getString(C2703R.string.ui_spinner))) {
                            horizontalLinearLayout = iUipJsonParser.parseSpinner(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                        linearLayout2.addView(horizontalLinearLayout);
                    }
                    jsonReader.endObject();
                    if (arrayList.size() < 32) {
                        arrayList2.add(strNextName);
                        arrayList.add(scrollView);
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        viewPager.setAdapter(new C3763cf(arrayList, arrayList2));
        this.OoooOoo.setViewPager(viewPager);
        bindEvent(arrayList);
        saveToConfigFile(Oooooo);
        return linearLayout;
    }

    private void OooO0oo(ViewGroup viewGroup) throws JSONException {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            String str = (String) childAt.getTag();
            if ((childAt instanceof LinearLayout) || (childAt instanceof C2698b)) {
                OooO0oo((ViewGroup) childAt);
            } else if (childAt instanceof CheckBox) {
                this.Oooooo0.put(str, ((CheckBox) childAt).isChecked());
            } else if (childAt instanceof Spinner) {
                this.Oooooo0.put(str, ((Spinner) childAt).getSelectedItemPosition());
            } else if (childAt instanceof EditText) {
                this.Oooooo0.put(str, ((EditText) childAt).getText().toString());
            }
        }
    }

    public void bindEvent(List<ScrollView> list) {
        UipEventStub.registerHandler(this.OooooOo);
        this.OooooO0 = list;
        for (ScrollView scrollView : list) {
            scrollView.setScrollbarFadingEnabled(false);
            OooO0O0(scrollView);
        }
    }

    public void configViewFromFile(String str) {
        try {
            configViewFromJson(FileUtils.readFileToString(new File(str)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void configViewFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.OooooOO = true;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Iterator<ScrollView> it = this.OooooO0.iterator();
                while (it.hasNext()) {
                    View viewFindViewWithTag = it.next().findViewWithTag(next);
                    if (viewFindViewWithTag != null) {
                        if (viewFindViewWithTag instanceof CheckBox) {
                            ((CheckBox) viewFindViewWithTag).setChecked(jSONObject.getBoolean(next));
                        } else if (viewFindViewWithTag instanceof Spinner) {
                            Spinner spinner = (Spinner) viewFindViewWithTag;
                            spinner.setSelection(jSONObject.getInt(next) < spinner.getAdapter().getCount() ? jSONObject.getInt(next) : 0);
                        } else if (viewFindViewWithTag instanceof EditText) {
                            ((EditText) viewFindViewWithTag).setText(jSONObject.getString(next));
                        }
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.OooooOO = false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.OooooOO) {
            return;
        }
        UiMessage.ControlEvent.Builder type = UiMessage.ControlEvent.newBuilder().setControlId((String) view.getTag()).setType(UiMessage.ControlEvent.Event_Type.ON_CLICK);
        int i = C2703R.id.uip_function_key;
        UipEventStub.hasEvent(UiMessage.UipToCommand.newBuilder().setCommand(UiMessage.UipToCommand.Command_Type.EVENT).setIsSuccess(true).setEvent(type.setEventFunctionName((String) view.getTag(i)).build()).build().toByteString());
        new StringBuilder("onClick Function Name: ").append((String) view.getTag(i));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        new StringBuilder("isCodeEvent: ").append(this.OooooOO);
        if (this.OooooOO) {
            return;
        }
        UiMessage.ControlEvent controlEventBuild = UiMessage.ControlEvent.newBuilder().setControlId((String) adapterView.getTag()).setType(UiMessage.ControlEvent.Event_Type.ON_CLICK).setEventArgs(String.valueOf(i)).setEventFunctionName((String) adapterView.getTag(C2703R.id.uip_function_key)).build();
        UipEventStub.hasEvent(UiMessage.UipToCommand.newBuilder().setCommand(UiMessage.UipToCommand.Command_Type.EVENT).setIsSuccess(true).setEvent(controlEventBuild).build().toByteString());
        new StringBuilder("onItemSelected: ").append(controlEventBuild);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public LinearLayout parseLayoutFromJson(String str, IUipJsonParser iUipJsonParser) {
        return this.OoooOoO.getResources().getConfiguration().orientation == 2 ? OooO(str, iUipJsonParser) : OooO0oO(str, iUipJsonParser);
    }

    public void restoreConfig() {
        configViewFromFile(Oooooo);
    }

    public String saveConfigToJson() {
        this.Oooooo0 = new JSONObject();
        Iterator<ScrollView> it = this.OooooO0.iterator();
        while (it.hasNext()) {
            try {
                OooO0oo((LinearLayout) it.next().getChildAt(0));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return this.Oooooo0.toString();
    }

    public void saveToConfigFile(String str) throws Throwable {
        try {
            FileUtils.writeStringToFile(new File(str), saveConfigToJson());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public View transform(int i) {
        for (ScrollView scrollView : this.OooooO0) {
            ViewParent parent = scrollView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(scrollView);
            }
            new StringBuilder("childCount of scrollview: ").append(((ViewGroup) scrollView.getChildAt(0)).getChildCount());
        }
        if (i == 2) {
            C2699c c2699c = new C2699c(this.OoooOoO);
            this.Ooooo0o = c2699c;
            c2699c.OooO0Oo(this.OooooO0);
            this.Ooooo0o.setSelectTab(this.OoooOoo.getViewPager().getCurrentItem());
            return this.Ooooo0o;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ScrollView> it = this.OooooO0.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next().getTag());
        }
        LinearLayout linearLayout = new LinearLayout(this.OoooOoO);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        SlidingTabLayout slidingTabLayout = new SlidingTabLayout(this.OoooOoO);
        this.OoooOoo = slidingTabLayout;
        slidingTabLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.OoooOoo.setSelectedIndicatorColors(this.OoooOoO.getResources().getColor(C2703R.color.ui_show_blue));
        this.OoooOoo.setDistributeEvenly(true);
        linearLayout.addView(this.OoooOoo);
        ViewPager viewPager = new ViewPager(this.OoooOoO);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        viewPager.setLayoutParams(layoutParams);
        linearLayout.addView(viewPager);
        viewPager.setAdapter(new C3763cf(this.OooooO0, arrayList));
        viewPager.setCurrentItem(this.Ooooo0o.getCurrentItem());
        this.OoooOoo.setViewPager(viewPager);
        return linearLayout;
    }
}
