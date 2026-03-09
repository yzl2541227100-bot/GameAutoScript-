package com.cyjh.elfin.p200ui.view.customview.loadwidget.swiperefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.anythink.expressad.foundation.p120g.C1801a;
import p285z2.InterfaceC4350sa;
import p285z2.InterfaceC4424ua;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseFootView extends LinearLayout implements InterfaceC4424ua {
    public InterfaceC4350sa OoooOoO;

    public BaseFootView(Context context) {
        super(context);
    }

    public BaseFootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCallBack(InterfaceC4350sa interfaceC4350sa) {
        String str = "۠ۦۥۨ۠ۚۖۢۘ۬ۗ۫ۗ۬۠ۘ۫ۨۗ۟ۡۚۘۘۘ۬ۙۦ۫ۙۘۘۖ۫ۚ۫ۢۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 462) ^ C1801a.f11005aP) ^ 498) ^ (-464509070)) {
                case -1447052093:
                    str = "ۢ۬۬ۦ۫ۖۘۤۥۥۙۢ۠ۖۨۥۘۗۜ۟ۜۚۙ۬۟ۜۘ۠ۖۘۗۖۦۦ۫ۜۨۡۤۡۚ۟۠ۚۤ";
                    break;
                case -1333604494:
                    return;
                case -179482632:
                    str = "ۥۜۛۛ۫ۗۙۜۙۨ۠ۦ۠ۖ۬ۢ۫ۘ۠۬ۘۘۜۜۨ۟ۥ۫ۨۘۛۘۛۧ۫ۨۘ";
                    break;
                case 55492584:
                    this.OoooOoO = interfaceC4350sa;
                    str = "۬ۖۛۗۨۙ۫۟ۗۥۢۚۜۙۙۗۤۥۘۢۤۦۘۘۗۖ۬ۗۙۥۜۛۛ۟۠ۛ۬ۘۘ۫ۖۙۢ۠۬ۥ۫ۛۤۛۜۥۨۦۘ۬ۜ";
                    break;
            }
        }
    }
}
