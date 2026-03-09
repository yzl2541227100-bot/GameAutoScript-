package com.anythink.expressad.video.signal;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.j */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2313j {

    /* JADX INFO: renamed from: m_ */
    public static final int f14330m_ = 1;

    /* JADX INFO: renamed from: n_ */
    public static final int f14331n_ = 2;

    /* JADX INFO: renamed from: o */
    public static final int f14332o = 2;

    /* JADX INFO: renamed from: o_ */
    public static final int f14333o_ = 3;

    /* JADX INFO: renamed from: p */
    public static final int f14334p = 1;

    /* JADX INFO: renamed from: p_ */
    public static final int f14335p_ = 4;

    /* JADX INFO: renamed from: q */
    public static final int f14336q = 2;

    /* JADX INFO: renamed from: q_ */
    public static final int f14337q_ = 5;

    /* JADX INFO: renamed from: r */
    public static final int f14338r = 0;

    /* JADX INFO: renamed from: r_ */
    public static final int f14339r_ = 0;

    /* JADX INFO: renamed from: s */
    public static final int f14340s = 1;

    /* JADX INFO: renamed from: s_ */
    public static final int f14341s_ = 1;

    /* JADX INFO: renamed from: t_ */
    public static final int f14342t_ = 1;

    /* JADX INFO: renamed from: u_ */
    public static final int f14343u_ = 2;

    /* JADX INFO: renamed from: v_ */
    public static final int f14344v_ = 1;

    /* JADX INFO: renamed from: w_ */
    public static final int f14345w_ = 2;

    /* JADX INFO: renamed from: x_ */
    public static final int f14346x_ = -1;

    /* JADX INFO: renamed from: y_ */
    public static final int f14347y_ = 1;

    void alertWebViewShowed();

    void closeVideoOperate(int i, int i2);

    void dismissAllAlert();

    int getBorderViewHeight();

    int getBorderViewLeft();

    int getBorderViewRadius();

    int getBorderViewTop();

    int getBorderViewWidth();

    String getCurrentProgress();

    void hideAlertView(int i);

    boolean isH5Canvas();

    void notifyCloseBtn(int i);

    void progressBarOperate(int i);

    void progressOperate(int i, int i2);

    void setCover(boolean z);

    void setInstallDialogState(boolean z);

    void setMiniEndCardState(boolean z);

    void setScaleFitXY(int i);

    void setVisible(int i);

    void showAlertView();

    void showIVRewardAlertView(String str);

    void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    void soundOperate(int i, int i2);

    void soundOperate(int i, int i2, String str);

    void videoOperate(int i);
}
